import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        //if one string has more charecters than the other automatically return false
        if (a.length() != b.length()) 
            return false;
            //automatically convert all input to lowercase letters
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        //first for loop keeps track of string a's each individual 
        //char and int lettersForA/lettersForB keeps track of how many of 
        //that certain letter is in string a and b.
        for(int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            int lettersForA = 0;
            int lettersForB = 0;
            
            //for string a, a certain charecter is found, lettersForA
            //(the amount of that letter) increases by 1.
            for(int j = 0; j < a.length(); j++) {
                if(letter==a.charAt(j)) {
                    lettersForA++;
                }
                
            }
            //for string b, if certain charecter is found, the amount
            //of times that letter appears increases by 1
            for(int k = 0; k < b.length(); k++) {
                if(letter==b.charAt(k)) {
                    lettersForB++;
                }
            }
            //if the number of certain charecters are not equal in
            //both strings, return false, else return true
            if(lettersForA != lettersForB) {
                return false;
                
            }
            
            
        
        
        
        }
        return true;
        
    }
  