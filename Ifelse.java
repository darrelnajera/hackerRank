import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Ifelse  {



    private static final Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        int n = scanner.nextInt(); 
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();  
        //if number divided by 2 has a remainder print weird
        if(n % 2 != 0){
            System.out.println("Weird");
        //if number divided by 2 has no remainder, n is greater than or equal to 2, and n is less than 
        //or equal to 5, print not weird    
        } else if(n % 2 == 0 && n >= 2 && n <= 5){
            System.out.println("Not Weird");
        //if n divided by 2 has no remainder, n is greater than or equal to 6, and n is less than or equal to 20
        //print not weird    
        } else if(n % 2 == 0 && n >= 6 && n <= 20){
            System.out.println("Weird");
        //for conditions not met above, just print not weird    
        } else {
            System.out.println("Not Weird");
        }
        
    }
}
