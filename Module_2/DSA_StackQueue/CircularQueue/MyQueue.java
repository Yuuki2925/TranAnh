public class MyQueue implements IQueue {
    protected Node front;
    protected Node rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.link = newNode;
        rear = newNode;
        rear.link = front;
    }

    @Override
    public void deQueue() {
        if (front == null) {
            System.out.println("Queue is empty, cannot dequeue.");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }

    @Override
    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        do {
            System.out.print(current.data + " ");
            current = current.link;
        } while (current != front);
        System.out.println();
    }
}
