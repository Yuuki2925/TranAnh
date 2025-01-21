import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử " + i + ":");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();
        int indexDel = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indexDel = i;
                break;
            }
        }

        if (indexDel == -1) {
            System.out.print("Không tồn tại phần tử " + x + "trong mảng");
        } else {
            for (int i = indexDel; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println("Mảng sau khi xoá phần tử " + x + ":");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
