package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int [][] twoDAraay = {
                {3,6,9,12,15},
                {18,21,24,27,30},
                {33,36,39,42,45},
                {48,51,54,57,60},
                {63,66,69,72,75}
        };

        for(int row = 0;row < twoDAraay.length;row++){
            for(int column = 0;column<twoDAraay[row].length;column++){
                System.out.print(twoDAraay[row][column]);
            }
            System.out.println();
        }
        
    }
}
