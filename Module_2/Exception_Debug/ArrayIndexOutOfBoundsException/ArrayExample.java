import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nVui lòng nhập chỉ số của một phần tử bất kỳ (0 - 99): ");

        try {
            int x = scanner.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng (0 - 99).");
        } catch (Exception e) {
            System.err.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
