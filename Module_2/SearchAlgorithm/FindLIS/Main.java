import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        FindLIS finder = new FindLIS();
        String result = finder.LIS(input);

        System.out.println("Chuỗi tăng dần lớn nhất là: " + result);
    }
}
