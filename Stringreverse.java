import java.io.*;
import java.util.*;

public class Stringreverse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //user input
        String input =scanner.nextLine();
        //use string builder to reverse our input
        String palindrome = new StringBuilder(input).reverse().toString();
        //return yes if input equsls String palindrome
        if(input.equals(palindrome)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



