package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][5];
        for(int row =0; row <twoDimArray.length; row++){
            for(int column = 0;column<twoDimArray[row].length; column++){
                twoDimArray[row][column] = row * column;
            }
        }

        for(int row =0; row< twoDimArray.length;row++){
            for(int column = 0;column<twoDimArray[row].length;column++){
                System.out.print(twoDimArray[row][column] +"\t");
            }
            System.out.println();
        }
    }

}
