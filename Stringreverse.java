import java.io.*;
import java.util.*;

public class Stringreverse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String palindrome = new StringBuilder(input).reverse().toString();
        if(input.equals(palindrome)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



