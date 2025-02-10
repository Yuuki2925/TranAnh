public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        // Kiểm tra phương thức add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Size after adding elements: " + list.size());

        // Kiểm tra phương thức get
        System.out.println("Element at index 1: " + list.get(1));

        // Kiểm tra phương thức contains
        System.out.println("List contains 20: " + list.contains(20));
        System.out.println("List contains 40: " + list.contains(40));

        // Kiểm tra phương thức indexOf
        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Index of 40: " + list.indexOf(40));

        // Kiểm tra phương thức remove
        list.remove(1);
        System.out.println("Size after removing an element: " + list.size());
        System.out.println("Element at index 1 after removal: " + list.get(1));

        // Kiểm tra phương thức clone
        MyList<Integer> clonedList = list.clone();
        System.out.println("Cloned list size: " + clonedList.size());
        System.out.println("Element at index 0 in cloned list: " + clonedList.get(0));

        // Kiểm tra phương thức clear
        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
