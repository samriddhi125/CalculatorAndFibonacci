import java.util.*;
public class Input {
    public double[] inputNumbers(){ // double array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = sc.nextDouble();

        double[] numbers = new double[2];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;

        return numbers;
    }

    public int[] inputArray(){ // double array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < n; i++){
            System.out.println("Enter element.");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
