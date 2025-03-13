import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = min(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
        System.out.println("Position of the smallest element: " + index);
    }

    public static int min(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
