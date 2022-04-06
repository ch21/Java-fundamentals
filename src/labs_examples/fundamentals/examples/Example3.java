package labs_examples.fundamentals.examples;

/*
   This program illustrates the differences
   between int and double.

   Call this file Example2.java.
*/
class Example3 {
    public static void main(String[] args) {
        int var;  // this declares an int variable
        int var2; // this declares an 2nd int variable
        double x; // this declares a floating-point variable
        double y;// this decalares a 2nd floating-point variable

        var = 10; // assign var the value 10
        var2 = 20;// assing var to the value 20

        x = 10.0; // assign x the value 10.0
        y = 20.0; // assign y to the value 20.0

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of var2: " + var2);


        System.out.println("Original value of x: " + x);
        System.out.println("Original value of y: " + y);

        System.out.println(); // print a blank line
        System.out.println();// prints out second blank line

        // now, divide both by 4
        var = var / 4;
        x = x / 4;

        // now, ill divide new by 4
        var2 = var2 / 4;
        y = y/4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);

        System.out.println("var2 after division: " + var2);
        System.out.println("y after division: " + y);
    }
}