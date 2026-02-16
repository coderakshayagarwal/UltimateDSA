package Arrays;

public class ReverseArray {

    // The WRONG Way
    public static int[] reverse (int[] arr) {
        int [] rev = new int[arr.length];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static int[] betterReverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40};
        // int []reverse = reverse(arr);
        int []reverse = betterReverse(arr);
        for (int i: reverse) {
            System.out.println(i);
        }
    }
}
