package labs_examples.arrays.labs;

public class methods {
        public static void main(String[] args) {
                int a = 3;
                int b = 4;
                 multiply(a, b);
                // please write the four methods as instructed below
                // then call each method from here within the main()
                isEven(4);
                reverseStringMethod("Hello world");
        }



    // please write a static multiply() method below that takes
        // two parameters (argumets) and returns the result of
        // multiplying them together
        public static void multiply(int a, int b){
                        // calculates the sum of the two parameters
                        int sum = a * b;
                        // prints out the sum
                        System.out.println("The sum is: " + sum);
                        // the return keyword is not required on a void method
                }

        // please write a static divide() method below that takes
        // two parameters (argumets) and returns the result of
        // dividing the first parameter by the second parameters

        public static void Divide(int a, int b){
                // calculates the sum of the two parameters
                int sum = a / b;
                // prints out the sum
                System.out.println("The sum is: " + sum);
                // the return keyword is not required on a void method
        }



                // please write a static isOdd() method that takes one numeric
                // parameter and returns a true (boolean) if the parameter is odd
                public static void isEven(int number) {
                      if( number % 2 == 0){
                              System.out.println(number + " is even");
                      }
                      else {
                              System.out.println(number + "not even");
                      }

                }
    private static void reverseStringMethod(String hello_world) {
        String name = hello_world;

        String reversedString = new StringBuilder(name).reverse().toString();

        System.out.println(reversedString);
    }

    }


//                 please write a method that will take in a String (as an argument)
//                 and return that String in reverse order. For instance, if you pass
//                 in the String "programming is cool" the method will return the
//                 String "looc si gnimmargorp"
//        }


