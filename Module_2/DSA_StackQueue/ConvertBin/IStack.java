public interface IStack<T> {
    boolean isEmpty();
    T peek();
    T pop();
    void push(T item);
    int search(T item);
    int size();
}
