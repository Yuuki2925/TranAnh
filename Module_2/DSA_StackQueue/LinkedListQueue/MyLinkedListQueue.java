public class MyLinkedListQueue implements ILinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    @Override
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
