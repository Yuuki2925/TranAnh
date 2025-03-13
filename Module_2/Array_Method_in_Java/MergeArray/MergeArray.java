import java.sql.Array;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Nhập số phần tử mảng 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
