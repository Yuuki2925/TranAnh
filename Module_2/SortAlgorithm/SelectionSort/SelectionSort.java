import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
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

        selectionSort(array);

        System.out.println("After-sort: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();

        scanner.close();
    }
}
