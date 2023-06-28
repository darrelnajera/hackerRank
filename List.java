import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //number of integers we will have
        int number = scanner.nextInt();
        //create an arraylist since we will have multiple lines of input
        ArrayList<Integer> arrayList = new ArrayList<>();
        //iterate through the first number inputted
        for(int i = 0; i < number; i++) {
            //add all the in second line of user input and add to arraylist
            int integers = scanner.nextInt();
            arrayList.add(integers);
        }
        //number of queries we will try to insert
        int queries = scanner.nextInt();
        //iterate through number of queries selected
        for(int i = 0; i < queries; i++) {
            //user input that will be either insert or delete
            String query = scanner.next();
            //
            if(query.equals("Insert")){
                //user input
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                //insert and replace the number at index x with y
                arrayList.add(y,x);
            //else delete number at position of int x 
            } else if(query.equals("Delete")) {
                int x = scanner.nextInt();
                arrayList.remove(x);
            }
        }
        //for each loop to print out new altered input
        for (Integer i : arrayList) {
            System.out.print(i+" ");
        }
    }
}
