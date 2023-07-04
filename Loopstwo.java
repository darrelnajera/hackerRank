import java.util.*;
import java.io.*;

class Loopstwo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        //outer loop grabs the user input a b and n for sequences
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            //calculate sequence values and print them out
            //iterate through last integer n
            for (int j=0; j<n; j++){
                //a is always first so a = a+b
                a += b;
                //print a space if number at index j is greater than 0. 
                if (j > 0) {
                    System.out.print(" ");
                }
                //print out a since a is handling our sum
                //the value of b is doubled and added to sequence every time after a and therefore is added to a
                System.out.print(a);
                b = b * 2;
            }
            //newline end
            System.out.print("\n");
        }
        
        in.close();
    }
}
