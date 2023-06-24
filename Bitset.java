public class Bitset {
    import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //user input for length of bitsets
        int N = in.nextInt();
        //operations user input
        int M = in.nextInt();
        //create an array that holds bits
        BitSet[] b = new BitSet[]{new BitSet(N), new BitSet(N)};
        //iterate through operations
        for(int i = 0; i < M; i++) {
            //
            String q = in.next();
            int left = in.nextInt() - 1;
            int right = in.nextInt() - 1;
            //return true if both bits are not different
            if(q.equals("AND")) {
                b[left].and(b[right]);
            }
            //return false if both conditions are different
            if(q.equals("OR")) {
                b[left].or(b[right]);
                
}           //return true if bits are different
            if(q.equals("XOR")) {
                b[left].xor(b[right]);
}   
            //set the first bit to its complimented bit's index
            if(q.equals("FLIP")) {
                b[left].flip(N - right - 1);
            }
            //set left bit value to true at complimented index bit
            if(q.equals("SET")) {
                b[left].set(N - right - 1);
            }
            //use cardinality to print out the array of bits that are true
            System.out.println(b[0].cardinality() + " " + b[1].cardinality());
        }
    }
}

}
