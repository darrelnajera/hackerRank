import java.io.*;
import java.util.*;

public class Arraylist{

    public static void main(String[] args) {
        //arraylist with constraint of 20000
        ArrayList[] arrayList = new ArrayList[20000];
        Scanner scanner = new Scanner(System.in);
        //this user inpu will be the integer for the number of all our lists
        int lists = scanner.nextInt();
       //iterate through our whole arraylist
       for(int i = 0; i < lists; i++) {
           //create lists inside of our empty arraylist
           arrayList[i] = new ArrayList();
           //this will be the integer for how many numbers there will be on each line
           int number = scanner.nextInt();
           //iterate through the whole line of numbers
           for(int j = 0; j < number; j++) {
               //store user input to group int numbers together
               int allNumbers = scanner.nextInt();
               //add the values on each line to our arraylist
               arrayList[i].add(allNumbers);
           }
           
       }
       //now we will do queries or search for the x and y number on each line
       int queries = scanner.nextInt();
       //iterate through queries
       for(int k = 0; k < queries; k++) {
           //search for number at x and y
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           //use try and catch to print error if query search is not found
           try {
               //print out the numbers at x and y and voila
               System.out.println(arrayList[x-1].get(y-1));
               //else error
           } catch (Exception e) {
               System.out.println("ERROR");
           }
       }
        
    }
}
