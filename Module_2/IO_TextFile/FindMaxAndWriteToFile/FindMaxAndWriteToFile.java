import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FindMaxAndWriteToFile {
    public ArrayList<Integer> readFile (String filePath) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            System.out.println("File not found or content error");
        }
    }
}
