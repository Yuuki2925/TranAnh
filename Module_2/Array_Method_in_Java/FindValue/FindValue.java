import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Jin", "Min", "Yuuki", "Jax", "Ginn"};
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của sinh viên " + name + " là: " + i);
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }
}
