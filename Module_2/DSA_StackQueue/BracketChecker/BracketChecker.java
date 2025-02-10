import java.util.Stack;

public class BracketChecker {
    public static boolean isBracketChecker(String str) {
        Stack<Character> stack = new Stack<>();
        str = str.replaceAll("\\s", "");

        for (char character : str.toCharArray()) {
            if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
