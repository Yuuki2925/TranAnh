import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập màu sắc tam giác: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.print(triangle);
    }
}
