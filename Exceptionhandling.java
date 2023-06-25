import java.io.*;
import java.util.*;

public class Exceptionhandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //test to see if integers are bits or if y is 0
        try{
            //user input
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            //divide
            System.out.println(a/b);
        }
        catch(Exception e){
            //produce error if wrong operation happens in try
            if(e instanceof java.lang.ArithmeticException)
            //convert error to string
                System.out.println(e.toString());
                //if catch has the instance of input pattern not matching,  produce following error statement
            if(e instanceof java.util.InputMismatchException)
                System.out.println("java.util.InputMismatchException");
        }
    }
    
}
      