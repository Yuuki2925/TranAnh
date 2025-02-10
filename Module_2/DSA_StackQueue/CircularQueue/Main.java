public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
