
   
import java.util.*;
import java.io.*;

public class Map{
	public static void main(String []argh)
	{
        //Implement hash map to store name and correspnding phone number
		HashMap<String,Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        //user input for number of entries
        int number =in.nextInt();
        in.nextLine();
        //iterate through entries
        for(int i=0;i<number;i++)
        {
            //user input for name
            String name=in.nextLine();
            //user input for number
            int phone=in.nextInt();
            //add entry or entries to hash map
            phoneBook.put(name,phone);
            in.nextLine();
        }
        //check user input with hasnext
        while(in.hasNext())
        {
            //print out result in name = number format and print not found if query does not match
            String s=in.nextLine();
            System.out.println(phoneBook.containsKey(s)?s+"="+phoneBook.get(s):"Not found");
        }
	}
}


    

