import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter a: ");
        a = sc.nextFloat();
        System.out.print("Enter b: ");
        b = sc.nextFloat();
        System.out.print("Enter c: ");
        c = sc.nextFloat();
        float delta = b * b - 4 * a * c;
        float x1, x2;
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.printf("x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép");
            x1 = x2 = -b / (2 * a);
            System.out.printf("x1 = x2 = %.2f", x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
