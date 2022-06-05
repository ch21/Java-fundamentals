package labs_examples.arrays.labs;
public class ReturnExample{
    public static void main(String[] args){
        int a = 2;
        int b = 8;
        // assign the value returned from returnSum() to the variable sum
        int sum = returnSum(a, b);
        // print out the sum of a and b
        System.out.println("The sum is: " + sum);
        //change the value of a
        a = 10;
        // change the value of b
        b = 5;
        // call the "printSum()" method
        printSum(a, b); // call printSum()
    }
    // the method below has a return type of int - as shown in the line below
    public static int returnSum(int a, int b){
        // calculates and returns the sum of the two parameters
        return a + b;
    }
    // the method below has "void" as a return type - it does not return a value
    public static void printSum(int a, int b){
        // calculates the sum of the two parameters
        int sum = a + b;
        // prints out the sum
        System.out.println("The sum is: " + sum);
        // the return keyword is not required on a void method
    }
    public static void earlyExit(){
        for(int i = 0; i < 10; i++){
            if (i == 4){
                // if "i" is equal to 4 - exit the method
                return;
            }
            System.out.println("i = " + i);
        }
        /*  output will be:
            i = 0
            i = 1
            i = 2
            i = 3
        */
    }
}
