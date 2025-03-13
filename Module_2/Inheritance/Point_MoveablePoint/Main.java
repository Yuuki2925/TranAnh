public class Main {
    public static void main(String[] args) {
        MovablePonit movablePonit = new MovablePonit(1, 5, 0.5f, 1);
        System.out.println("Vị trí ban đầu: " + movablePonit);

        for(int i = 0 ; i < 3; i++) {
            movablePonit.move();
            System.out.println("Sau lần di chuyển thứ " + (i + 1) + ": " + movablePonit);
        }
    }
}
