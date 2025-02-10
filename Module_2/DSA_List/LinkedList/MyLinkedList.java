public class MyLinkedList {
    private Node head;
    private int numNodes;

    // Constructor: Khởi tạo danh sách với phần tử đầu tiên.
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes = 1;
    }

    // Thêm một phần tử vào vị trí index trong danh sách.
    public void add(int index, Object data) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index không hợp lệ: " + index);
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        numNodes++;
    }

    // Thêm phần tử vào đầu danh sách.
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    // Lấy phần tử tại vị trí index.
    public Node get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index không hợp lệ: " + index);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (Node) temp.getData();
    }

    // In danh sách liên kết.
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Lấy số phần tử trong danh sách.
    public int size() {
        return numNodes;
    }
}
