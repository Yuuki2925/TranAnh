import java.util.Scanner;

public class MatrixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int maxRows = 0, maxCols = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxRows = i;
                    maxCols = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất là: " + max);
        System.out.println("Vị trí: [" + maxRows + "][" + maxCols + "]");
    }
}
