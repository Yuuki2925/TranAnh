import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        int size;
        do {
            System.out.print("Nhập cột muốn tính: ");
            size = sc.nextInt();
            if (size < 0 || size >= cols) {
                System.out.print("Không tìm thấy cột. Vui lòng nhập lại! ");
            }
        } while (size < 0 || size >= cols);

        int sum = 0;
        for(int j = 0; j < rows; j++){
            sum += arr[j][size];
        }
        System.out.print("Tổng cột " + size + ": " + sum);
    }
}
