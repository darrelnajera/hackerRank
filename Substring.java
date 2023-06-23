import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Substring {
   


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //user input for a string
        String input = scanner.nextLine();
        //user input for beginning index and end index of string
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        //return the substring with inputted indices
        System.out.println(input.substring(start, end));
    }
}

    
