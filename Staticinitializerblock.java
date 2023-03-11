import java.io.*;
import java.util.*;

public class Staticinitializerblock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //call method use 4 and 7 as an example
        findArea(4,7);
       
    }
    
    public static int findArea(int base, int height){
        //implement scanner in method
        Scanner scanner = new Scanner(System.in);
        //store value for area
        int area = 0;
        //user input for base and height
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        //if input involves postive numbers, area equals base times height
        if (base > 0 && height > 0){
            area = base * height;
        //print out exception error if any numbers are negative 
        } else {
            
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return area
    }
}

    
