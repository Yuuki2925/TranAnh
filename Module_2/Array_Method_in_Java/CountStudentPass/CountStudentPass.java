import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = sc.nextInt();
        } while (size > 30);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Điểm của sinh viên " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (arr[i] > 5 && arr[i] <= 10) {
                count++;
            }
        }

        System.out.print("\nSố sinh viên qua môn là: " + count);
    }
}
