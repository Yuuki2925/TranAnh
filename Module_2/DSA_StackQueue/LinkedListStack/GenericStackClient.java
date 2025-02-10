public class GenericStackClient {
    public void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Three");
        stack.push("Two");
        stack.push("Four");
        stack.push("Six");
        stack.push("Five");

        System.out.println("Total elements: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println("Total elements after remove: " + stack.size());
    }

    public void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.print("2.1. Size of stack after push operations: " + stack.size());
        System.out.print("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        GenericStackClient genericStackClient = new GenericStackClient();
        System.out.println("1. Stack of Integers: ");
        genericStackClient.stackOfIntegers();
        System.out.println("2. Stack of String: ");
        genericStackClient.stackOfStrings();
    }
}
