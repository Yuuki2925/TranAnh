import java.util.Scanner;

class NumberReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to read: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            switch (number) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
                case 10: System.out.println("ten"); break;
            }
        } else if (number >= 11 && number < 20) {
            if (number == 11) System.out.println("eleven");
            else if (number == 12) System.out.println("twelve");
            else if (number == 13) System.out.println("thirteen");
            else if (number == 14) System.out.println("fourteen");
            else if (number == 15) System.out.println("fifteen");
            else if (number == 16) System.out.println("sixteen");
            else if (number == 17) System.out.println("seventeen");
            else if (number == 18) System.out.println("eighteen");
            else if (number == 19) System.out.println("nineteen");
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;

            String tensWord = "";
            if (tens == 2) tensWord = "twenty";
            else if (tens == 3) tensWord = "thirty";
            else if (tens == 4) tensWord = "forty";
            else if (tens == 5) tensWord = "fifty";
            else if (tens == 6) tensWord = "sixty";
            else if (tens == 7) tensWord = "seventy";
            else if (tens == 8) tensWord = "eighty";
            else if (tens == 9) tensWord = "ninety";

            if (ones > 0) {
                switch (ones) {
                    case 1: System.out.println(tensWord + " one"); break;
                    case 2: System.out.println(tensWord + " two"); break;
                    case 3: System.out.println(tensWord + " three"); break;
                    case 4: System.out.println(tensWord + " four"); break;
                    case 5: System.out.println(tensWord + " five"); break;
                    case 6: System.out.println(tensWord + " six"); break;
                    case 7: System.out.println(tensWord + " seven"); break;
                    case 8: System.out.println(tensWord + " eight"); break;
                    case 9: System.out.println(tensWord + " nine"); break;
                }
            } else {
                System.out.println(tensWord);
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;

            switch (hundreds) {
                case 1: System.out.print("one hundred"); break;
                case 2: System.out.print("two hundred"); break;
                case 3: System.out.print("three hundred"); break;
                case 4: System.out.print("four hundred"); break;
                case 5: System.out.print("five hundred"); break;
                case 6: System.out.print("six hundred"); break;
                case 7: System.out.print("seven hundred"); break;
                case 8: System.out.print("eight hundred"); break;
                case 9: System.out.print("nine hundred"); break;
            }

            if (remainder > 0) {
                System.out.print(" and ");
                if (remainder < 10) {
                    switch (remainder) {
                        case 1: System.out.println("one"); break;
                        case 2: System.out.println("two"); break;
                        case 3: System.out.println("three"); break;
                        case 4: System.out.println("four"); break;
                        case 5: System.out.println("five"); break;
                        case 6: System.out.println("six"); break;
                        case 7: System.out.println("seven"); break;
                        case 8: System.out.println("eight"); break;
                        case 9: System.out.println("nine"); break;
                    }
                } else if (remainder < 20) {
                    if (remainder == 11) System.out.println("eleven");
                    else if (remainder == 12) System.out.println("twelve");
                    else if (remainder == 13) System.out.println("thirteen");
                    else if (remainder == 14) System.out.println("fourteen");
                    else if (remainder == 15) System.out.println("fifteen");
                    else if (remainder == 16) System.out.println("sixteen");
                    else if (remainder == 17) System.out.println("seventeen");
                    else if (remainder == 18) System.out.println("eighteen");
                    else if (remainder == 19) System.out.println("nineteen");
                } else {
                    int tens = remainder / 10;
                    int ones = remainder % 10;

                    String tensWord = "";
                    if (tens == 2) tensWord = "twenty";
                    else if (tens == 3) tensWord = "thirty";
                    else if (tens == 4) tensWord = "forty";
                    else if (tens == 5) tensWord = "fifty";
                    else if (tens == 6) tensWord = "sixty";
                    else if (tens == 7) tensWord = "seventy";
                    else if (tens == 8) tensWord = "eighty";
                    else if (tens == 9) tensWord = "ninety";

                    if (ones > 0) {
                        switch (ones) {
                            case 1: System.out.println(tensWord + " one"); break;
                            case 2: System.out.println(tensWord + " two"); break;
                            case 3: System.out.println(tensWord + " three"); break;
                            case 4: System.out.println(tensWord + " four"); break;
                            case 5: System.out.println(tensWord + " five"); break;
                            case 6: System.out.println(tensWord + " six"); break;
                            case 7: System.out.println(tensWord + " seven"); break;
                            case 8: System.out.println(tensWord + " eight"); break;
                            case 9: System.out.println(tensWord + " nine"); break;
                        }
                    } else {
                        System.out.println(tensWord);
                    }
                }
            } else {
                System.out.println();
            }
        } else {
            System.out.println("Out of ability");
        }
    }
}