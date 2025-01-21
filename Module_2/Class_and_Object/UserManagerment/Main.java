import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager(5);

        while (true) {
            System.out.println("\n=== User Manager ===");
            System.out.println("1. Add User");
            System.out.println("2. Show Users");
            System.out.println("3. Edit User");
            System.out.println("4. Remove User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    userManager.addUser(new User(id, name, email, age));
                    break;
                case 2:
                    System.out.println("User list:");
                    userManager.showListUser();
                    break;

                case 3:
                    System.out.print("Enter ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();

                    userManager.editUser(editId, new User(editId, newName, newEmail, newAge));
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    userManager.removeUser(removeId);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
