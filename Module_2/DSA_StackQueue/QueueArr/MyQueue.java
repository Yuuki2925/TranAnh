public class MyQueue implements IQueueArr {
    private final int capacity;
    private final int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;
    private boolean isFull;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        this.queueArr = new int[this.capacity];
        this.head = 0;
        this.tail = -1;
        this.currentSize = 0;
        this.isFull = false;
    }

    @Override
    public boolean isQueueFull() {
        return isFull;
    }

    @Override
    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    @Override
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
            return;
        }

        tail++;
        if (tail == capacity) {
            tail = 0;
        }

        queueArr[tail] = item;
        currentSize++;

        if (currentSize == capacity) {
            isFull = true;
        }
        System.out.println("Element " + item + " is pushed to Queue!");
    }

    @Override
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
            return;
        }

        System.out.println("Pop operation done! Removed: " + queueArr[head]);
        head++;

        if (head == capacity) {
            head = 0;
        }

        currentSize--;
        isFull = false;
    }

    @Override
    public void show() {
        for (int j : queueArr) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }
}
