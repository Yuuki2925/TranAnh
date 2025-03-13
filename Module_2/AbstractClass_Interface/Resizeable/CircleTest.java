public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Pre-increase: ");
        Circle[] circle = new Circle[2];
        circle[0] = new Circle(3.5);
        circle[1] = new Circle(3.5, "indigo", false);

        for (Circle c : circle) {
            System.out.println(c);
        }
        double percent = Math.random() * 100;
        System.out.printf("\nResize với: %.2f\n",percent);

        System.out.println("\nAfter-increase: ");
        for (Circle c : circle) {
            c.resize(percent);
            System.out.println(c);
        }

    }
}