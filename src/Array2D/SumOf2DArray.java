package Array2D;

public class SumOf2DArray {

    public static int sumOfElements(int [][]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = InputOutput.takeInputs();
        InputOutput.printArray(arr);
        int sum = sumOfElements(arr);
        System.out.println("Sum: " + sum);
    }
}
