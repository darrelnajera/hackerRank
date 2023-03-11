import java.io.*;
import java.util.*;

public class Stringreverse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //user input
        String input =scanner.nextLine();
        //implement the reverse toString to reverse input and check if it is a palindrome
        //store it into string palindrome
        String palindrome = new StringBuilder(input).reverse().toString();
        //after reversed, if input equals a palindrome print out yes, otherwise print no
        if(input.equals(palindrome)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



