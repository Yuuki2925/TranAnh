import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String PHONE_NUMBER = "^\\([0-9]{2}\\)-0[0-9]{9}$";

    public ValidateNumberPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateNumberPhone validateClass = new ValidateNumberPhone();
        System.out.print("Enter your phone number: ");
        String nameClass = scanner.nextLine();
        if (validateClass.validate(nameClass)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
