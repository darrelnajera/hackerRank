import java.io.*;
import java.util.*;

public class Endoffile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //counter for each string on new line starting from number 1
        int count = 1;
       

        //the while loop stops working until new data(input) is inputted.
        //count increases by 1
        while (scanner.hasNext()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
        scanner.close();
    }
}
