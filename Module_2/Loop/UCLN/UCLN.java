import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("Greatest Common Divisor = " + a);
    }
}
