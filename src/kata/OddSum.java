public class OddSum {
    public int sumValues(int[] array) {
        int totalOdds = 0;
        for(int i = 0; i < array.length; i++) {
            int number = array[i];
            if(number % 2 != 0){
                totalOdds = number + totalOdds;
            }
        }
        return totalOdds;
    }
}

//Create a methods which returns the sum of all odd
//values contained in an integer array.
