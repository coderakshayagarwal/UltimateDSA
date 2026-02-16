package Array2D;

import java.util.Scanner;

public class InputOutput {

    public static int[][] takeInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter row count: ");
        int rowCount = scanner.nextInt();

        int [][] jArray = new int[rowCount][];

        int colCount;
        for(int i = 0; i < rowCount; i++) {
            System.out.print("Enter column count for row #" + (i+1) + ": ");
            colCount = scanner.nextInt();
            jArray[i] = new int[colCount];
        }

        // Take Values for each element
        System.out.println("Now Please Enter Values for each element:");
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                System.out.print("Enter Value for " + i + "X" + j + " : ");
                jArray[i][j] = scanner.nextInt();
            }
        }
        return jArray;
    }

    public static void printArray(int [][] jArray) {
        System.out.println("\nPrinting the 2D-Array:");
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                System.out.print(jArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] jArray = takeInputs();
        printArray(jArray);
    }
}
