import java.io.*;
import java.util.*;

public class DictionaryApp {
    private static final Map<String, Word> dictionary = new HashMap<>();
    private static final String DATA_FOLDER = "./dicts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(DATA_FOLDER);

        if (!file.exists()) {
            System.out.println("File không tồn tại!");
        }

        while (true) {
            printMenu();

            System.out.print("Vui lòng chọn chức năng: ");
            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại một số hợp lệ.");
                continue;
            }

            switch (choice) {
                case IChoice.lOOKUP:
                    System.out.print("Nhập từ khóa cần tra cứu: ");
                    String lookupKeyword = scanner.nextLine().trim();
                    lookup(lookupKeyword);
                    break;

                case IChoice.DEFINE:
                    System.out.print("Nhập loại từ (ví dụ: noun, verb, adj): ");
                    String type = scanner.nextLine().trim();
                    System.out.print("Nhập từ cần định nghĩa: ");
                    String wordName = scanner.nextLine().trim();
                    System.out.print("Nhập nghĩa của từ: ");
                    String meaning = scanner.nextLine().trim();
                    define(type, wordName, meaning);
                    break;

                case IChoice.DROP:
                    System.out.print("Nhập từ khóa cần xóa: ");
                    String dropKeyword = scanner.nextLine().trim();
                    drop(dropKeyword);
                    break;

                case IChoice.EXPORT:
                    export(String.valueOf(file));
                    break;

                case IChoice.EXIT:
                    System.out.println("Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Tra cứu từ");
        System.out.println("2. Thêm định nghĩa cho từ");
        System.out.println("3. Xóa từ");
        System.out.println("4. Xuất dữ liệu từ điển ra file");
        System.out.println("0. Thoát");
        System.out.println("==============");
    }

    public static void lookup(String keyword) {
        if (dictionary.containsKey(keyword)) {
            Word word = dictionary.get(keyword);
            System.out.println("Từ: " + word.getWord());

            for (Definition def : word.getDefinitions()) {
                System.out.println(" " + def);
            }
        } else {
            System.out.println("Không tìm thấy từ: " + keyword);
        }
    }

    public static void define(String type, String wordName, String meaning) {
        Word word = dictionary.getOrDefault(wordName, new Word(wordName));
        String example = "No example provided!";
        Definition definition = new Definition(type, meaning, example);
        word.addDefinition(definition);
        dictionary.put(wordName, word);
        System.out.println("Định nghĩa đã được thêm cho từ: " + wordName);
    }

    public static void drop(String keyword) {
        if (dictionary.containsKey(keyword)) {
            dictionary.remove(keyword);
            System.out.println("Từ " + keyword + " đã bị xóa.");
        } else {
            System.out.println("Từ không tồn tại: " + keyword);
        }
    }

    public static void export(String filePath) {
        Set<String> existingWords = getStrings(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Map.Entry<String, Word> entry : dictionary.entrySet()) {
                String word = entry.getKey();

                if (existingWords.contains(word)) {
                    System.out.println("Từ \"" + word + "\" đã có trong file.");
                } else {
                    bufferedWriter.write("Từ: " + word + "\n");
                    for (Definition def : entry.getValue().getDefinitions()) {
                        bufferedWriter.write("  " + def + "\n");
                    }
                    System.out.println("Từ \"" + word + "\" đã được thêm vào file.");
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi xuất dữ liệu: " + e.getMessage());
        }
    }

    private static Set<String> getStrings(String filePath) {
        Set<String> existingWords = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Lấy từ trong file và thêm vào set
                if (line.startsWith("Từ: ")) {
                    existingWords.add(line.substring(4).trim()); // Lấy phần sau "Từ: "
                }
            }
        } catch (IOException e) {
            // Nếu file không tồn tại, bỏ qua vì sẽ tạo mới file
        }
        return existingWords;
    }
}
