import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float)-b / a;
            System.out.println("x = " + x);
        }
    }
}
// btn: Viết phương trình bậc 2
/* btn2: ax + by = c
         dx + gy = f
*/