public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Thêm phần tử vào đầu danh sách
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // In danh sách sau khi thêm vào đầu
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Size: " + list.size());

        // Thêm phần tử vào cuối danh sách
        list.addLast(40);
        list.addLast(50);

        // In danh sách sau khi thêm vào cuối
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Size: " + list.size());

        // Xóa danh sách
        list.clear();
        System.out.println("Size after clear: " + list.size());
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }
}
