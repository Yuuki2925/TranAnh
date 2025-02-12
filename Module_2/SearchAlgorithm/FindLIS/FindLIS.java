import java.util.ArrayList;

public class FindLIS {

    public String LIS(String str) {
        if (str.isEmpty()) {
            return "";
        }

        ArrayList<Character> arrList = new ArrayList<>();
        arrList.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar > arrList.get(arrList.size() - 1)) {
                arrList.add(currentChar);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char character : arrList) {
            result.append(character);
        }

        return result.toString();
    }
}
