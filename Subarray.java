 import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        //implement scanner and int for user input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //1d array will consist of user inputted int's 
        int[] array = new int[number];
        //iterate only through user input
        for(int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            
        }
        
        scanner.close();
        //store int we will return
        int sumOfNegatives = 0;
        //triple nested loop as follows: 1st loop iterates only through i(first number), 2nd loop iterates from i to j, and 3rd loop iterates from j to less than or equal to the end of the loop to avoid going out of bounds
        for(int i = 0;i < number; i++) {
            for(int j = i;j < number; j++) {
                //store int for the sum of subarrays
                int currentSum = 0;
                for(int k = i; k <= j; k++) {
                    //current sum = the sum of all subarray after k loop is executed
                    currentSum = currentSum + array[k];
                    
                }
                //if the current sum we stored earlier is negative increase the count by 1
                if(currentSum < 0) {
                    sumOfNegatives++;
                }
                
            }
            
        }
        //return count
        System.out.println(sumOfNegatives);
    }
}

