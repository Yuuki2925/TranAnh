import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static final String STUDENT_FILE = "data/students.csv";

    public static void addStudent() {
        Scanner sc = new Scanner(System.in);
        List<String[]> students = CSVHelper.readCSV(STUDENT_FILE);

        int lastId = students.isEmpty() ? 0 : Integer.parseInt(students.get(students.size() - 1)[0]);
        String studentId = String.valueOf(lastId + 1);

        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        while (name.length() < 4 || name.length() > 50) {
            System.out.print("Tên phải từ 4-50 ký tự. Nhập lại: ");
            name = sc.nextLine();
        }

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String birthDate = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        while (!phoneNumber.matches("^(090|091)\\d{7}$")) {
            System.out.print("Số điện thoại phải có 10 số và bắt đầu bằng 090 hoặc 091. Nhập lại: ");
            phoneNumber = sc.nextLine();
        }

        for (String[] student : students) {
            if (student[4].equals(phoneNumber)) {
                System.out.println("Số điện thoại đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập mã lớp học: ");
        String classId = sc.nextLine();

        students.add(new String[]{studentId, name, birthDate, gender, phoneNumber, classId});
        List<String> lines = new ArrayList<>();
        for (String[] s : students) {
            lines.add(String.join(",", s));
        }

        CSVHelper.writeCSV(STUDENT_FILE, lines);
        System.out.println("Thêm sinh viên thành công!");
    }

    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        List<String[]> students = CSVHelper.readCSV(STUDENT_FILE);

        System.out.print("Nhập ID sinh viên cần xóa: ");
        String studentId = sc.nextLine();

        boolean found = false;
        List<String> newLines = new ArrayList<>();

        for (String[] student : students) {
            if (student[0].equals(studentId)) {
                found = true;
                System.out.print("Bạn có chắc muốn xóa? (Yes/No): ");
                String confirm = sc.nextLine();
                if (!confirm.equalsIgnoreCase("Yes")) {
                    System.out.println("Hủy xóa.");
                    return;
                }
                continue;
            }
            newLines.add(String.join(",", student));
        }

        if (!found) {
            try {
                throw new NotFoundStudentException("Sinh viên không tồn tại.");
            } catch (NotFoundStudentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            CSVHelper.writeCSV(STUDENT_FILE, newLines);
            System.out.println("Xóa sinh viên thành công!");
        }
    }

    public static void showStudents() {
        List<String[]> students = CSVHelper.readCSV(STUDENT_FILE);
        System.out.println("Danh sách sinh viên:");
        for (String[] student : students) {
            System.out.printf("ID: %s | Name: %s | Birth: %s | Gender: %s | Phone: %s | Class: %s\n",
                    student[0], student[1], student[2], student[3], student[4], student[5]);
        }
    }
}
