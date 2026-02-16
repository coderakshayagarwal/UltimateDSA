package Arrays;

public class FindMaximumNumber {

    public static int findMaximumNumber(int [] arr) {

        int maxNum = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int maxNumber = findMaximumNumber(arr);
        System.out.println("Maximum Number: " + maxNumber);
    }
}
