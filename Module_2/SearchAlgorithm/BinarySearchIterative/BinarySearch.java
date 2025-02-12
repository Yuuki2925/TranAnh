import java.util.Scanner;

public class BinarySearch {
    public static void bubbleSort(int[] arr) {
        for ( int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);
        System.out.print("Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        System.out.print("Enter a number you want to search: ");
        int key = scanner.nextInt();
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        boolean check = false;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (arr[midIndex] == key) {
                check = true;
                System.out.println("Found " + key + " at position " + midIndex);
                break;
            } else if (arr[midIndex] > key) {
                rightIndex = midIndex - 1;
            } else if (arr[midIndex] < key) {
                leftIndex = midIndex + 1;
            }
        }

        if (!check) {
            System.out.println("Not found!");
        }
    }
}
