public class MyLinkedList<E> implements ILinkedList {
    private Node head;
    private int numNodes;

    @Override
    public void addFirst(Object o) {
        Node temp = head;
        head = new Node(o);
        head.next = temp;
        numNodes++;
    }

    @Override
    public void addLast(Object o) {
        if (head == null) {
            head = new Node(o);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(o);
        }
        numNodes++;
    }


    @Override
    public int size() {
        return numNodes;
    }

    @Override
    public Object getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public Object getLast() {
        Node temp;
        if (head == null) {
            return null;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
        }
        return temp.data;
    }

    @Override
    public void clear() {
        head = null;
        numNodes = 0;
    }
}
