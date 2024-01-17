public class Fibonnaci {
    public static void main(String args[]){
        System.out.println("Enter number of elements to print");
        int number = Integer.parseInt(System.console().readLine());

        System.out.println("Fibonacci series:");
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n){ //recursive method to find fibonacci series

        if (n <= 1){
            return n;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
