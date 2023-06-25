import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    static Singleton instance = new Singleton();
    //create singleton class to return a single objevy
    private Singleton() {
        
    }
    //implement a string class
    public String str;
    //return the string instance of singleton class
    static Singleton getSingleInstance() {
        return instance;

}
}