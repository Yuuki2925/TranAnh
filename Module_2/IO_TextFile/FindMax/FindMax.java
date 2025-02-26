import java.io.*;
import java.util.ArrayList;

public class FindMax {
    public ArrayList<Integer> readFile (String filePath) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(Integer.parseInt(line));
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }

        return arrayList;
    }

    public static int findMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }

        return max;
    }

    public void writeFile (String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.newLine(); // Thêm dòng mới sau khi ghi xong
            bufferedWriter.flush(); // Đảm bảo ghi ra file
            bufferedWriter.close(); // Đảm bảo đóng BufferedWriter
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FindMax findMax = new FindMax();
        ArrayList<Integer> arrayList = findMax.readFile("./numbers.txt");

        // Gọi phương thức tĩnh findMax qua lớp FindMax
        int maxValue = FindMax.findMax(arrayList);

        findMax.writeFile("result.txt", maxValue);
    }
}
