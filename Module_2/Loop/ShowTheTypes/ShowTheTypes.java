import java.util.Scanner;

public class ShowTheTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    System.exit(0);

                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                default:
                    System.out.println("Not choice!");
            }
        }
    }
}