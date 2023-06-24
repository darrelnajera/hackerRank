import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hashset {

 public static void main(String[] args) {
        //
        Scanner s = new Scanner(System.in);
        //input for denoting number of pairs
        int t = s.nextInt();
        //store array for left and right string in respect to t
        String [] pair_left = new String[t];
        //array for right string
        String [] pair_right = new String[t];
        
        //for loop will allow pairs to be made up to t times
        for (int i = 0; i < t; i++) {
            //add pair to each line
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

    
HashSet<String> pairs = new HashSet<String>(t);
//iterate through integer that denotes the number of pairs again
for(int i = 0; i < t; i++)
{
    //add the pairs of strings to the hashmap 
    pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
    //integer output(size of string pair in hash map)
    System.out.println(pairs.size());  
}      

 }
}