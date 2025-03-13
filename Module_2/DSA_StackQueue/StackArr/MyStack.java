public class MyStack implements IStack {
    private final int size;
    private int index = 0;
    private final int[] arr;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[index] = element;
        index++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        index--;
        return arr[index];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean isFull() {
        return index == size;
    }
}
