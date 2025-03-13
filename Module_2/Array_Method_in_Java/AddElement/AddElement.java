import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int num = sc.nextInt();
        int[] arr = new int[num + 1];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập phần tử cần thêm: ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();

        if (index < 0 || index > num) {
            System.out.println("Vị trí chèn không hợp lệ.");
        } else {
            for (int i = num; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;

            System.out.println("Mảng sau khi chèn: ");
            for (int i = 0; i <= num; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
