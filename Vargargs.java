import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 class Add{
    //create integer type class
    public void add(int ... integers){
        //if there is more that 1 integer than inputted
        if(integers.length>1){
            //store value for integer at first index
            int sum = integers[0];
            // this is the string for the all the lines of addition in output
            String output = String.valueOf(integers[0]);
            //starting after first integer at index 0, we will iterate through rest of integers
            for(int i=1;i<integers.length;i++){
                //add the integers to sum string above
                sum +=integers[i];
                
                output += "+" + integers[i]; 
            }
            //add the equals sign after all integers in string added
            output +="="+sum;
            //return
            System.out.println(output);
        }
    }
}



public class Vargargs {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}