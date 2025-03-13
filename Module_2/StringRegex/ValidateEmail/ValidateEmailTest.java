public class ValidateEmailTest {
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();
        for (String email : validEmail) {
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
