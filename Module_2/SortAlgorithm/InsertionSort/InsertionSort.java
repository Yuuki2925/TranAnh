import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int pos = i - 1;
            int value = array[i];

            while (pos >= 0 && value < array[pos]) {
                array[pos + 1] = array[pos];
                --pos;
            }

            array[pos + 1] = value;
        }
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

        insertionSort(array);

        System.out.println("After-Sort: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
