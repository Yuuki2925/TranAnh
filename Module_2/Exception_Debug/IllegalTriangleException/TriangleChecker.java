import java.util.Scanner;

public class TriangleChecker {
    public static void checkTriangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("The sides of a triangle cannot be negative or zero");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("The sum of two sides must be greater than the remaining side");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter side a: ");
            int sideA = scanner.nextInt();
            System.out.print("Enter side b: ");
            int sideB = scanner.nextInt();
            System.out.print("Enter side c: ");
            int sideC = scanner.nextInt();

            checkTriangle(sideA, sideB, sideC);
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number");
        }
    }
}
