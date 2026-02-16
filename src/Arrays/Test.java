package Arrays;

public class Test {
    public static void main(String[] args) {

        // 1. Declaration of Arrays
        int [] intArr; // Array Declaration

        // 2. Initialize
        intArr = new int[5];
        //TODO: default value of characters

        // 3. Initializing with values
        int []newArr = {10, 20 ,30, 40, 50, 60, 70, 80};

        // 1. Printing Values of Array
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        //  2. Printing with ForEach Loop
        for (int i: newArr) {
            System.out.println(i);
        }
    }
}