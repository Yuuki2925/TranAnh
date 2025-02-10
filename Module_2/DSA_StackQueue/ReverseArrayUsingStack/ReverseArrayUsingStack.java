import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int number : arr) {
            stack.push(number);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Phần tử arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int reverse : arr) {
            System.out.print(reverse + " ");
        }
    }
}
