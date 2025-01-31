import java.util.Arrays;

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
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(2.5, "Indigo", false);
        System.out.println(circles);

        Arrays.sort(circles);

        System.out.println("After-Sorted: ");
        for(ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}