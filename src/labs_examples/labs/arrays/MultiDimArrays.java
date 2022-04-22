package labs_examples.labs.arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        int[][] twoArrays = new int[4][7];
        for (int i = 0; i < twoArrays.length; i++) {
            for (int j = 0; j < twoArrays[i].length; j++) {
                //why multiply them
                twoArrays[i][j] = i * j;
                System.out.print(twoArrays[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
