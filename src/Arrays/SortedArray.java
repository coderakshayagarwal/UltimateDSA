package Arrays;

public class SortedArray {

    public static boolean isSorted(int[] arr) {
        int prevElement = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < prevElement) {
                return false;
            }
            prevElement = arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Is sorted: " + isSorted(arr));
    }
}
