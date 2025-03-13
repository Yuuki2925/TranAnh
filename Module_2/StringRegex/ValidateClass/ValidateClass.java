import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_NAME = "^[CAP][0-9]{4}[GHIK]$";

    public ValidateClass() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateClass validateClass = new ValidateClass();
        System.out.print("Enter your name class: ");
        String nameClass = scanner.nextLine();
        if (validateClass.validate(nameClass)) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
V