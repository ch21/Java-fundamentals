package labs_examples.fundamentals.examples;

/*
  Demonstrate the if.

  Call this file IfDemo.java.
*/
class IfDemo {
    public static void main(String args[]) {
        int a, b, c, d, e, f;

        a = 2;
        b = 3;
        d = 4;
        e = 5;

        //check if a is less that b
        if(a < b) System.out.println("a is less than b");
        if (d < e) System.out.println("c is less than d");

        //check if they are equal
        //they are not so
        // this won't display anything
        if(a == b) System.out.println("you won't see this");
        if (d == e) System.out.println("you wonnt see this because not ture");

        //new line break
        System.out.println();

        c = a - b; // c contains -1


        System.out.println("c contains -1");// not conditional
        if(c >= 0) System.out.println("c is non-negative"); //is c 0 or positive
        if(c < 0) System.out.println("c is negative");//is c negative

        f = d - e; // c contain -1
        System.out.println("f contains -1 ");
        if (f>= 0)System.out.println("c is non-negatve"); // is f 0 or postive
        if(f < 0)System.out.println("f is negative");// is f necgative

        System.out.println();// new line break

        //now setting c to positive number
        // goes through same process of checking
        c = b - a; // c now contains 1
        System.out.println("c contains 1");
        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");

        // changing new set to positive
        f = e - d;// f now contain 1
        System.out.println("f contain 1");
        if (f >= 0) System.out.println("f is not negative");
        if (f<0) System.out.println("f is negative");

    }
}
