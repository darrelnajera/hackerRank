import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tagcontentextractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            //string to check if matches html format
			String string = in.nextLine();
            //boolean to check
            boolean formatMatched = false;
            //here we use regex pattern to check if the string matches html format in exact order
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            //match the pattern with the string from beginning
			Matcher matcher = pattern.matcher(string);
            //use matcher.find to find the pattern
            
            while(matcher.find()) {
                //print out the input subsequence after matching result
                System.out.println(matcher.group(2));
                //boolean is true if pattern is matched
                formatMatched = true;
            }
            //if pattern doesnt match, print out "none"
            if(!formatMatched) {
                System.out.println("None");
                    
            }
             
        }
	}
}


