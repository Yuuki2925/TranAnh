import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height, width;
        System.out.print("Enter height: ");
        height = sc.nextFloat();
        System.out.print("Enter width: ");
        width = sc.nextFloat();
        float res = height * width;
        System.out.println("Area: " + res);
    }
}
