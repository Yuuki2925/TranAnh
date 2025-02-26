import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("./Source.txt");
        File target = new File("./Target.txt");

        if (!source.exists() || !target.exists()) {
            System.out.println("Tep nguon hoac tep dich khong ton tai");
        }

        try (FileReader fileReader = new FileReader(source);
             FileWriter fileWriter = new FileWriter(target)) {

            int character;
            int charCount = 0;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                charCount++;
            }

            System.out.println("Sao chép thành công.");
            System.out.println("Số ký tự đã sao chép: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay tep");
        } catch (IOException e) {
            System.out.println("Da xay ra loi trong qua trinh sao chep tep");
        }
    }
}
