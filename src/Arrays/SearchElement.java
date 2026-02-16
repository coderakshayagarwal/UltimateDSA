package Arrays;

public class SearchElement {

    public static boolean findElement(int[] arr, int element) {
        for(int i: arr) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        int elementToFind = 50;
        boolean isElementPresent = findElement(arr, elementToFind);
        System.out.println("Is Element Present: " + isElementPresent);
    }
}
