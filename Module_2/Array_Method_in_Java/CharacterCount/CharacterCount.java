import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.print("Nhập ký tự cần đếm: ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.print("Số lần ký tự " + ch + "xuất hiện trong chuỗi là: " + count);
    }
}
