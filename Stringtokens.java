import java.io.*;
import java.util.*;

public class Stringtokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //input for string
        String string = scan.nextLine();
        scan.close();
        //remove whitespace from both ends of input
        string = string.trim();
        //return 0 if string has no characters
        if(string.length() == 0) {
            System.out.println(0);
            return;
        }
        //split the string into substrings and place the substring into an array of only letters from a-z and A-Z using regex
        String[] subStrings = string.split("[^a-zA-Z]+");
        //print out length of substrings
        System.out.println(subStrings.length);
        
        //for each loop to print out all the whole array after everything
        for(String printAllStrings : subStrings) {
            System.out.println(printAllStrings);
        }
    }
}



