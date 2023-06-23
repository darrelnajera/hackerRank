
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Primalitytest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        //big integer user input
        BigInteger number = scanner.nextBigInteger();

        scanner.close();
        //use isprobableprime method to check if big integer is prime or not. print out return message as follows
        System.out.println(number.isProbablePrime(10) ? "prime" : "not prime");
    }
}

