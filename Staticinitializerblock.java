import java.io.*;
import java.util.*;

public class Staticinitializerblock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        if (base > 0 && height > 0){
            System.out.println(findArea(base,height));
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static int findArea(int base, int height){
        return base * height;
    }
}

    
