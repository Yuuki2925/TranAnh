import java.util.Scanner;

public class BubbleSort {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
