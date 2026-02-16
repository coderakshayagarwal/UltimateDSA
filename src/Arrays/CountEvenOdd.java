package Arrays;

public class CountEvenOdd {

    public static void countEvenOdd(int [] arr) {
        int countOdd = 0;
        int countEven = 0;

        for (int i: arr) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven + " | Odd: " + countOdd);
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        countEvenOdd(arr);
    }
}
