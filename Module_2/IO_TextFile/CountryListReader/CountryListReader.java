import java.io.*;

public class CountryListReader {
    public static void main(String[] args) {
        File file = new File("./countries.csv");
        BufferedReader bufferedReader = null;

        if (!file.exists()) {
            System.out.println("File not found");
            return;
        }

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split(",");

                String id = columns[0].trim();
                String code = columns[1].replace("\"", "").trim();
                String name = columns[2].replace("\"", "").trim();
                System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
