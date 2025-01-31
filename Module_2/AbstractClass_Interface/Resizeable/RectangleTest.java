public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("Pre-increase: ");
        Rectangle[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle(2.3, 5.8);
        rectangle[1] = new Rectangle(2.5, 3.8, "orange", true);

        for (Rectangle rec : rectangle) {
            System.out.println(rec);
        }

        double percent = Math.random() * 100;
        System.out.printf("\nResize với: %.2f\n",percent);

        System.out.println("\nAfter-increase: ");
        for (Rectangle rec : rectangle) {
            rec.resize(percent);
            System.out.println(rec);
        }
    }
}