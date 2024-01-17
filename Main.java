/*
Name: Samriddhi Kumari
PRN : 22070126100
Batch : AIML B1
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Calculator calculator = new Calculator();
        System.out.println("Menu: (1) to use calculator for 2 numbers\n"+"\t(2) to use calculator for an array");
        int x=sc.nextInt();
        switch (x) {
            case 1:
                double[] numbers = new double[2];
                numbers = input.inputNumbers();
                System.out.println("Menu:\n(1)Addition\n(2)Difference\n(3)Multiplication\n(4)Division");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("The addition of " + numbers[0] + " and " + numbers[1] + " is " + calculator.addition(numbers[0], numbers[1]));
                        break;
                    case 2:
                        System.out.println("The difference between " + numbers[0] + " and " + numbers[1] + " is " + calculator.difference(numbers[0], numbers[1]));
                        break;
                    case 3:
                        System.out.println("The product of " + numbers[0] + " and " + numbers[1] + " is " + calculator.product(numbers[0], numbers[1]));
                        break;
                    case 4:
                        System.out.println("The qoutient of " + numbers[0] + " and " + numbers[1] + " is " + calculator.divide(numbers[0], numbers[1]));
                        break;
                    default: {
                        System.out.println("Invalid Input.");
                        System.exit(0);
                    }
                }
            break;
            case 2:
                int[] arr = new int[10];
                arr = input.inputArray();
                System.out.println("Menu:\n(1)Sum of array\n(2)Mean of array\n(3)Mode of array\n(4)Median of the array\n(5)Variance of the array\n(6)Standard Deviation of the array");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("The addition of the array is : " + Calculator.sumArray(arr));
                        break;
                    case 2:
                        System.out.println("The mean of the array is : " + Calculator.meanArray(arr));
                        break;
                    case 3:
                        System.out.println("The mode of the array is : " + calculator.modeArray(arr));
                        break;
                    case 4:
                        System.out.println("The median of the array is : " + calculator.medianArray(arr));
                        break;
                    case 5:
                        System.out.println("The variance of the array is : " + Calculator.varianceArray(arr));
                        break;
                    case 6:
                        System.out.println("The standard deviation of the array is : " + Calculator.standardDeviationArray(arr));
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        System.exit(0);
                }
        }
    }
}
