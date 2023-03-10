
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
        int sumOfDivisors = 0;
        for(int input = 1; input <= n; input++) {
            if(n % input == 0){
                sumOfDivisors = sumOfDivisors + input;
            }
        }
        return sumOfDivisors;
    }
    
    
    
}



                                                                           