package labs_examples.fundamentals.examples;

/*
  Demonstrate the for loop.

  Call this file ForDemo.java.
*/
class ForDemo {
    public static void main(String args[]) {
        int count;// we declare a empty variable name count
        int count2; // new var called count2

        //for(initialization; condition; iteration) statement;
        for(count = 0; count < 5; count = count+1)
            System.out.println("This is count: " + count);

        System.out.println("Done!");
        System.out.println("lets count again:)...............");
        for(count2=0; count2 < 10; count2 = count2+1)

            System.out.println("This is count2: " + count2);
        System.out.println("Done! Again :) ");
        System.out.println("Now Im happy :) haha ");
    }
}