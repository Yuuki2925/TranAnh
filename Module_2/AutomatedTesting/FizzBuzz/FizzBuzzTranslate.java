public class FizzBuzzTranslate {
    public static String translate(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = number % 15 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if (isFizzBuzz || (contains3 && contains5)) {
            return "FizzBuzz";
        } else if (isFizz || contains3) {
            return "Fizz";
        } else if (isBuzz || contains5) {
            return "Buzz";
        } else {
            return readNumber(number);
        }
    }

    public static String readNumber(int number) {
        String[] listNumber = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        boolean isZero = number % 10 == 0;

        if (number < 10) {
            return listNumber[number];
        } else if (number < 20) {
            return "mười" + " " + listNumber[number % 10];
        } else if (isZero) {
            return listNumber[number / 10] + " " + "mươi";
        } else {
            return listNumber[number / 10] + " " + listNumber[number % 10];
        }
    }
}
