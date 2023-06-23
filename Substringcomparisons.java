public class Substringcomparisons {
    public static String getSmallestAndLargest(String string, int k) {
        //store strings for largest and smallest lexicographically, and the substring that we will compare, int k being the limit of the string
        String substringToCompare = string.substring(0,k);
        String smallest = substringToCompare;
        String largest = substringToCompare;
        
        //for loop that iterates through the length of the substrings in string we will compare
        for(int i = 1; i <= string.length() - k; i++) {
            substringToCompare = string.substring(i, i+ k);
            //assign largest variable to substring to compare if it is the greatest lexicographically
            if(substringToCompare.compareTo(largest) > 0) {
                largest = substringToCompare;
            }
            //assign smallest variable if lexicographical difference is less than 0
            if(substringToCompare.compareTo(smallest) < 0) {
                smallest = substringToCompare;
            }
        }
        
        //return smallest and largest substrings
        return smallest + "\n" + largest;
    }

}
