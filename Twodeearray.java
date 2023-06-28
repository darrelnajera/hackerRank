import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Twodeearray {
    static int hourglassSum(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        
        int maxSum = Integer.MIN_VALUE;
        //use two for loops for rows and columns. We would have to subtract 2 from rows and columns to avoid going out of bounds searching for non existent space to create hourglasses
        for(int i = 0; i < rows-2; i++){
            for(int j = 0; j < columns-2; j++) {
                //add together all possible values that form an hourglass in the 2-d array. move on to next hourglass
                int currentSum = array[i][j] + array[i][j+1] + array[i][j+2] 
                                    + array[i+1][j+1] + 
                  array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                //values we will compare to get the greatest between the sum of current hourglass we are on and thhe rest
                maxSum = Math.max(maxSum,currentSum);
                
                
            }
        }
        //return largest value between the two
        return maxSum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

