package Array2D;

public class Array2D {

    public static void main(String[] args) {
        // 2d array, there are two indexes, i (row), and j (col)
        int [][] arr2d = new int[3][3];

        // Initializing values in array
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d[i][j] = value++;
            }
        }

        // Printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        /*
        * Jagged Array: When no of columns are not same for every row.
        a b c
        d e f h
        g h
        * */

        int [][] jArray = new int[3][];
        jArray[0] = new int[3];
        jArray[1] = new int[4];
        jArray[2] = new int[2];

        int jValue = 1;
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                jArray[i][j] = jValue++;
            }
        }

        // Printing values
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                System.out.print(jArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
