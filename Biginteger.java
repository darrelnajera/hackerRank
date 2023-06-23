import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Biginteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        //use biginteger for bigger numbers
        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        //store biginteger variables for adding and multiplying 
        BigInteger multiply;
        BigInteger add;
        //assign operational values to add and multipy
        add = first.add(second);
        multiply = first.multiply(second);
        //print out
        System.out.println(add);
        System.out.println(multiply);
    }
}

    
