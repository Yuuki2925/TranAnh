import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    System.out.println("Swap " + arr[i] + " with " + arr[j]);
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    for (int illustration : arr) {
                        System.out.print(illustration + " ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("\nAfter-sort:");
        for (int array : arr) {
            System.out.print(array + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Your input array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(arr);
    }
}
