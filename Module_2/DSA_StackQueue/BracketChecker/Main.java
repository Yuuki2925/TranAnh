import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a expression: ");
        String str = sc.nextLine();

        if(BracketChecker.isBracketChecker(str)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }
}
