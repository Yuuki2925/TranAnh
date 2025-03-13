public interface IQueueArr {
    boolean isQueueFull();
    boolean isQueueEmpty();
    void enqueue(int item);
    void dequeue();
    void show();
}
