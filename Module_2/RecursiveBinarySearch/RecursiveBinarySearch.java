import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;

        if (arr[middle] == value) {
            return middle;
        } else if (arr[middle] < value) {
            return binarySearch(arr, middle + 1, right, value);
        } else {
            return binarySearch(arr, left, middle - 1, value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your size: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);

        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter your value want to search: ");
        int value = scanner.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, value);

        if (result != -1) {
            System.out.println("Value found at index: " + result);
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}
