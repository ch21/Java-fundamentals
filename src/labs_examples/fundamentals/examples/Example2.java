package labs_examples.fundamentals.examples;

/*
   This demonstrates a variable.

   Call this file Example2.java.
*/
class Example2 {
    public static void main(String args[]) {
        int var1; // this declares a variable
        int var2; // this declares another variable
        int var3; // this declares the third value

        var1 = 1024; // this assigns 1024 to var1
        var3 = 2022;// this assisngs 2022 to var3

        System.out.println("var1 contains " + var1);

        var2 = var1 / 2;

        System.out.print("var2 contains var1 / 2: ");
        System.out.println(var2);

        System.out.println("var 3 is:  " + var3);
    }
}