import java.util.*;

public class Onedeearray {

    public static void main(String[] args) {
	   
         //user input to denote size of array
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //1d array consists of size n
        int[] array = new int[n];
        //iterate through array
        for(int i = 0; i < n; i ++){
            //add integers to index i of array
            array[i] = scan.nextInt();
        }


}
