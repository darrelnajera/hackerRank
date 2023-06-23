import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Currencyformatter {
   

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user innput
        double payment = scanner.nextDouble();
        scanner.close();
        //get currency instance for usa
        NumberFormat first = NumberFormat.getCurrencyInstance(Locale.US);
        String usa = first.format(payment);
        //syntax to return currency from india
        NumberFormat second = NumberFormat.getCurrencyInstance(new Locale("en" , "IN"));
        String india = second.format(payment);
        //return instance from china
        NumberFormat third = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = third.format(payment);
        //instance from france
        NumberFormat fourth = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fourth.format(payment);




        //return strings
        
        System.out.println("US: " + usa);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
