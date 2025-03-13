public class Main {
    public static void main(String[] args) {
        Rectangle[] shape = new Rectangle[6];
        shape[0] = new Square();
        shape[1] = new Rectangle();
        shape[2] = new Square(4, "red", true);
        shape[3] = new Rectangle(2, 3);
        shape[4] = new Rectangle(3, 7, "blue", false);
        shape[5] = new Square(3);

        for (Rectangle rec : shape) {
            if (rec instanceof Square) {
                System.out.println(rec);
                System.out.println(((Square) rec).howToColor() + "\n");
            } else {
                System.out.println(rec + "\n");
            }
        }
    }
}