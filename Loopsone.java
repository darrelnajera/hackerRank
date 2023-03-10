
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Loopsone{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //in order to input several integers on one line similar to a string, we store the parse int trim method below to remove white space
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        //for loop prints out N times all numbers through 10 on each separate line
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + (N*i) );
        }

        bufferedReader.close();
    }
}

    

