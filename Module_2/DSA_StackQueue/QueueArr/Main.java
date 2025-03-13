public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(56);
        queue.show();
        queue.enqueue(2);
        queue.show();
        queue.enqueue(67);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(24);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(98);
        queue.show();
        queue.enqueue(45);
        queue.show();
        queue.enqueue(23);
        queue.show();
        queue.enqueue(435);
        queue.show();
    }
}
