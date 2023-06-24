
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Inheritanceone {
class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}


//extend animal class with more mothods to be called out
class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
   void sing()
   {
       System.out.println("I am singing");
   }
}


}
}
