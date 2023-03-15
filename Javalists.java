import java.io.*;
import java.util.*;

public class Javalists {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //store int for numbers in for loop, also user input
    int numbers = scanner.nextInt();

    //implement arraylist of integers
    ArrayList<Integer> integers = new ArrayList<>(numbers);

    //for loop keeps track of numbers and adds numbers to 
    //arraylist called integers when inputted
    for(int i = 0; i < numbers; i++){
        int input = scanner.nextInt();
        integers.add(input);
    }

    //we will store the integer for the queries that
    //will be done on the arraylist
    int queries = scanner.nextInt();

    //for loop keeps track of queries
    for(int i = 0; i < queries; i++) {

        //user input for command
        String command = scanner.nextLine();
        if(command.equals("Insert")) {
            
            //If input query equals insert, int y is inserted in whatever index
            //int x is
            //add the integers onto the array using .add


            int x = scanner.nextInt();
            int y = scanner.nextInt();
            integers.add(x,y);
        }

        //if command is delete remove the number at index x
        else if (command.equals("Delete")) {
            int x = scanner.nextInt();
            integers.remove(x);
        }
        
    }
    
    //use for each loop to print out the new array called integers after all the input
    for(Integer i : integers) {
        System.out.println(i + " ");
    }
    
    
    

    }
}
