package labs_examples.fundamentals.labs;

public class Example {
    public static void main(String[] args) {
        int result = multiply(12, 678);
        System.out.println("Its a great day! 12*678 =" + result);
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }
}