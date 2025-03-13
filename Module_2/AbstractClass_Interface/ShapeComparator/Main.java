import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //RectangleTest
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        System.out.print("\n");

        //SquareTest
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        System.out.print("\n");

        //CircleTest
        System.out.println("Pre-Sorted: ");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        for(Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("\nAfter-Sorted: ");
        for(Circle circle : circles) {
            System.out.println(circle);
        }
    }
}