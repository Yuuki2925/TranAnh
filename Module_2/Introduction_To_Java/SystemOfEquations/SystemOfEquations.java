import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter f: ");
        double f = sc.nextDouble();

        if (a * e == b * d) {
            if (a * f == c * d) {
                System.out.println("Hệ phương trình vô số nghiệm");
            } else {
                System.out.println("Hệ phương trình vô nghiệm");
            }
        } else {
            double x = (c * e - b * f) / (a * e - b * d);
            double y = (a * f - c * d) / (a * e - b * d);
            System.out.printf("The solution is x = %.2f, y = %.2f", x, y);
        }
    }
}
