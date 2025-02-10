import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> implements IStack<T> {
    protected LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        stack.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
