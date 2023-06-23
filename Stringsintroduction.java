import java.io.*;
import java.util.*;
public class Stringsintroduction {
  

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //two strings to compare
        String A=sc.next();
        String B=sc.next();
        //print out the sum of the length of both strings
        System.out.println(A.length()+ B.length());
        //use "compareTo to see if lexicographical difference exists between strings."
        if(A.compareTo(B) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            
        }
        //Print out both strings and use the substring method to capitalize the first letter of both strings and print out the rest of string lowercase
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
        
    }
}
