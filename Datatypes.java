import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        
        //user input
        int t=sc.nextInt();
        
        //for loop keeps track of all test cases(T)
        for(int i=0;i<t;i++)
        {
            //use try and catch to test if long x can be fitted in any of the datatypes. 
            try
            {
                //we use long because it is the biggest datatype and it has the largest range of numbers we can search for
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x <=32767)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            //if ouur input cannot fit in any of the datatyped we print out this error in catch
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

