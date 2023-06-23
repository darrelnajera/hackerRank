import java.util.Scanner;
import java.util.regex.*;

public class Patternsyntaxchecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        // user input for test cases
		int testCases = Integer.parseInt(in.nextLine());
        //while loop that goes on until test cases run out
		while(testCases>0){
            //user input that we will check if it properly uses regex
			String regex = in.nextLine();
          	//use try and catch method to check for errors
            try 
            {
                
                //if our string properly matches regex pattern, return valid
                Pattern.compile(regex);
                System.out.println("Valid");
                  
                   
            }
            //
            catch(PatternSyntaxException ex) 
            {
                //else print out error message
                System.out.println("Invalid");
            }
            //after every trial, cases decrease by 1
            testCases--;
		}
	}
}

