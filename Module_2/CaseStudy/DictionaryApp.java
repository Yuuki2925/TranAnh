import java.io.File;
import java.util.Scanner;

public class DictionaryApp {
    private static final String DATA_FOLDER = "./dicts.txt";
    private static final DictionaryManager dictionaryManager = new DictionaryManager();

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
                    dictionaryManager.lookup(lookupKeyword);
                    break;

                case IChoice.DEFINE:
                    System.out.print("Nhập loại từ (ví dụ: noun, verb, adj): ");
                    String type = scanner.nextLine().trim();
                    System.out.print("Nhập từ cần định nghĩa: ");
                    String wordName = scanner.nextLine().trim();
                    System.out.print("Nhập nghĩa của từ: ");
                    String meaning = scanner.nextLine().trim();
                    dictionaryManager.define(type, wordName, meaning);
                    break;

                case IChoice.DROP:
                    System.out.print("Nhập từ khóa cần xóa: ");
                    String dropKeyword = scanner.nextLine().trim();
                    dictionaryManager.drop(dropKeyword);
                    break;

                case IChoice.EXPORT:
                    dictionaryManager.export(DATA_FOLDER);
                    break;

                case IChoice.LIST:
                    dictionaryManager.listAllWords();
                    break;

                case IChoice.EDIT:
                    System.out.print("Nhập từ cần sửa: ");
                    String editWordName = scanner.nextLine().trim();
                    System.out.print("Nhập loại từ mới: ");
                    String newType = scanner.nextLine().trim();
                    System.out.print("Nhập nghĩa mới: ");
                    String newMeaning = scanner.nextLine().trim();
                    dictionaryManager.editWord(editWordName, newType, newMeaning);
                    break;

                case IChoice.SORT:
                    dictionaryManager.sortWord();
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
        System.out.println("5. Xem danh sách từ");
        System.out.println("6. Sửa từ");
        System.out.println("7. Sắp xếp từ");
        System.out.println("0. Thoát");
        System.out.println("==============");
    }
}
