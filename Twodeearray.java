public class Twodeearray {
    int solution(int[] arr) {
    //use two for loops that one for the rows(i) and j for the columns. This will be for the hourglass inside of the 2d array.
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            //In order to get the sum of the integers in the hourglass, we would have to look at the chart for a 2d array to see its positional numbers and would have to create an hourglass shape from all its positions
            int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                                   + arr[i+1][j+1] 
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
        }
    }
    //print out the sum of all the integers in the hourglass.
    System.out.println(sum);

    }
}
}