import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to convert to BIN: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Binary: 0");
        } else {
            while (number > 0) {
                stack.push(number % 2);
                number /= 2;
            }

            System.out.print("Binary: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
