import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements IStack<T> {
    protected List<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(this.size() - 1);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(this.size() - 1);
    }

    @Override
    public void push(T item) {
        elements.add(item);
    }

    @Override
    public int search(T item) {
        int index = elements.lastIndexOf(item);
        return index == -1 ? -1 : this.size() - index;
    }

    @Override
    public int size() {
        return elements.size();
    }
}
