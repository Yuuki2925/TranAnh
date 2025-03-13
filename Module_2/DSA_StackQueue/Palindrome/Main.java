import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (palindrome.isPalindrome(str)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This isn't Palindrome");
        }
    }
}
