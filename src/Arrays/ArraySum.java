package Arrays;

public class ArraySum {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20 , 30 , 40, 50};
        int sumArr = sumArray(arr);
        System.out.println("Sum of array: " + sumArr);
    }
}
