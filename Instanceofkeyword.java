import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class Instanceofkeyword{
	//arraylist for instances
   static String count(ArrayList mylist){
      //increasing integers anytime instance is found
      int a = 0,b = 0,c = 0;
      //iterate through size of arraylist
      for(int i = 0; i < mylist.size(); i++){
          //object method to get instance at index i
         Object element=mylist.get(i);
         //if elements equal student, rockstar, or hacker at index i, increase integers from earlier by 1
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      //
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
       //add instances to arraylist
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}
