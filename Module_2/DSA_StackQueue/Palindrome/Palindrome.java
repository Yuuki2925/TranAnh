import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (char ch : str.toCharArray()) {
            queue.offer(ch);
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (queue.poll() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
