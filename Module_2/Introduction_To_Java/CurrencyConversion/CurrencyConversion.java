import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyUSD;
        System.out.print("Enter USD: ");
        moneyUSD = sc.nextDouble();
        int rate = 25000;
        double moneyVND = moneyUSD * rate;
        System.out.println("VND: " + moneyVND);
    }
}