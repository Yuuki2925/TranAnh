import java.util.Scanner;

public class InterestCaculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money: ");
        double money = sc.nextDouble();
        System.out.println("Enter your month: ");
        int month = sc.nextInt();
        System.out.println("Enter your rate: ");
        double rate = sc.nextDouble();
        double res = 0;
        for (int i = 1; i <= month; i++) {
            res = money * (rate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + res);
    }
}
