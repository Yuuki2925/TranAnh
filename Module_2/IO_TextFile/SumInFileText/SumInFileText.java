import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SumInFileText {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line + " ");
                sum += Integer.parseInt(line);
            }

            bufferedReader.close();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("\nFile not found or content error");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter link file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        SumInFileText sumInFileText = new SumInFileText();
        sumInFileText.readFileText(path);
    }
}
