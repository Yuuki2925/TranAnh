import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DemergingQueue demergingQueue = new DemergingQueue();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your gender (Male/Female): ");
            String gender = scanner.nextLine();
            System.out.print("Enter your birth date (dd/MM/yyyy): ");
            String dateOfBirth = scanner.nextLine();

            Person person = new Person(name, gender, dateOfBirth);
            demergingQueue.classifyGender(person);
        }

        demergingQueue.listByGender();
        System.out.println("\nSorted employee list by gender and birth date:");
        demergingQueue.displayStaffList();
        scanner.close();
    }
}
