import java.util.Scanner;

public class InsertionSortIllustration {
    public static void insertionSort(int[] array) {
        System.out.println("Starting Insertion Sort...\n");

        for (int i = 1; i < array.length; i++) {
            int pos = i - 1;
            int value = array[i];

            System.out.println("Step " + i + ": Inserting " + value);

            while (pos >= 0 && value < array[pos]) {
                array[pos + 1] = array[pos];
                pos--;
            }

            array[pos + 1] = value;

            System.out.print("Array after step " + i + ": ");
            printArray(array);
            System.out.println();
        }

        System.out.println("Insertion Sort Completed!\n");
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
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

        System.out.println("\nOriginal Array: ");
        printArray(array);
        System.out.println("\n");

        insertionSort(array);

        System.out.println("Final Sorted Array: ");
        printArray(array);
    }
}
