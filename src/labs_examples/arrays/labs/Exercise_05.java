package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 7, 8};

        System.out.println("Array in Order");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println("Array in reversed");
        for(int i= myArray.length-1;i>=0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}



