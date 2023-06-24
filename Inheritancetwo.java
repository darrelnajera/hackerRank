import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Inheritancetwo {
//class we will extend
class Arithmetic {
    Arithmetic() {}
}
//extend arithmetic class to add in a and b
class Adder extends Arithmetic {
    Adder() {}
    
    int add(int a, int b) {
        return a + b;
    }
}
}


    
