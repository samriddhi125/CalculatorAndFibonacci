import java.util.*;

class Calculator {
    //finding sum of 2 numbers
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    //finding difference of 2 numbers
    public double difference(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    //doing multiplication of 2 numbers
    public double product(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    //doing division with 2 numbers
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Division by zero is not possible.");
            return -1;
        }
    }

    //finding sum of array
    public static int sumArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    //finding the mean of array
    public static double meanArray(int[] array) {
        return (double) sumArray(array) / array.length;
    }

    //finding the mode of array
    public int modeArray(int[] array) {
        Arrays.sort(array); //sort the array
        int mode = array[0];
        int max = 1;
        int currCount = 1;
        //comparing the frequency of all elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) { //if the element is the same as the previous one, add 1 to count
                currCount++;
            } else { //if element is not same as before, change frequency count
                if (currCount > max) { //replace max count if current count is higher
                    max = currCount;
                    mode = array[i - 1]; //mode is the previous element
                }
                currCount = 1; //reset current count
            }
        }
        return mode;
    }
    //finding the median of the array
    public int medianArray(int[] array) {
        Arrays.sort(array); //sort the array
        int median = array[0];

        if (array.length % 2 != 0) { //for odd number of elements, middle element is median
            median = array [array.length/2];
        }
        else { //for even number of elements, median is mean of 2 middle elements
            median = (array [array.length/2] + array [(array.length/2)-1] / 2) ;
        }
        return median;
    }
    //finding variance of array
    public static double varianceArray(int[] array) { // var = ((x - mean)^2) / N
        double mean = meanArray(array);
        double sumSquaredDiff = 0;

        for (int num : array) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }

        return sumSquaredDiff / array.length;
    }
    //finding the standard deviation of array
    public static double standardDeviationArray(int[] array) {
        return Math.sqrt(varianceArray(array)); // std = sqrt (var)
    }
}