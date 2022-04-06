package labs_examples.fundamentals.examples;

/*
  Demonstrate a block of code.

  Call this file BlockDemo.java.
*/
class BlockDemo {
    public static void main(String args[]) {
        double i = 5, j = 10, d, a = 10, b = 15, c;

//        i = 0; // will cause block to not execute
//        j = 10;


        // the target of this if is a block
        // code block used for two or more statements
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }

        System.out.println("lets do it again :0");
        if (a != 0){
            System.out.println("a does not equal 0");
            c = a/b;

            System.out.println("a/b is " + c );
        }
    }
}