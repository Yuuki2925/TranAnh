import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        Map<String, Integer> cntWord = WordFrequencyCounter.countWordFrequency(str);

        for(String word : cntWord.keySet()) {
            System.out.println(word + ": " + cntWord.get(word));
        }
    }
}
