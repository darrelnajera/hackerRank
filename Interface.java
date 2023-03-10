
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
        //store the integer for the sum of all divisors for later
        int sumOfDivisors = 0;
        
        //for loop iterates through intgers from 1 to less than or equal to n
        for(int input = 1; input <= n; input++) {
            
            //if any of the integers in the for loop have no remainder when divided, they are stored in sum of divisors
            
            if(n % input == 0){
                sumOfDivisors = sumOfDivisors + input;
            }
        }
        //return sumofdivisors
        return sumOfDivisors;
    }
    
    
    
}



                                                                           
