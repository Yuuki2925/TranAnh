import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("arr[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
    }
}
