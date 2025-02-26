import java.util.Scanner;

public class ComplexityAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int[] frequentChar = new int[256];

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            frequentChar[ch]++;
        }

        int maxFrequency = 0;
        char mostFrequentChar = '\0';
        for (int i = 0; i < 256; i++) {
            if (frequentChar[i] > maxFrequency) {
                maxFrequency = frequentChar[i];
                mostFrequentChar = (char) i;
            }
        }

        if (maxFrequency > 0) {
            System.out.println("The most appearing letter is '" + mostFrequentChar + "' with a frequency of " + maxFrequency + " times.");
        } else {
            System.out.println("The input string is empty.");
        }
    }
}
