import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PRODUCT MANAGEMENT MENU =====");
            System.out.println("1. Add Product.");
            System.out.println("2. Edit Product.");
            System.out.println("3. Remove Product.");
            System.out.println("4. Display Products.");
            System.out.println("5. Search Product by Name.");
            System.out.println("6. Sort Products by Price (Ascending).");
            System.out.println("7. Sort Products by Price (Descending).");
            System.out.println("0. Exit.");
            System.out.print("Choose an option (0-7): ");
            int choice = scanner.nextInt();

            if (choice == IChoice.EXIT) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (choice) {
                case IChoice.ADD_PRODUCT:
                    int id;
                    do {
                        System.out.print("Enter product ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();

                        if (productManager.isIdExists(id)) {
                            System.out.println("This ID already exists. Please enter a unique ID.");
                        }
                    } while (productManager.isIdExists(id));

                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;

                case IChoice.EDIT_PRODUCT:
                    productManager.editProduct();
                    break;

                case IChoice.REMOVE_PRODUCT:
                    productManager.removeProduct();
                    break;

                case IChoice.DISPLAY_PRODUCT:
                    productManager.displayProduct();
                    break;

                case IChoice.SEARCH_PRODUCT:
                    System.out.print("Enter product name to search: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;

                case IChoice.SORT_ASCENDING:
                    productManager.sortProductsAscending();
                    break;

                case IChoice.SORT_DESCENDING:
                    productManager.sortProductsDescending();
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 0 and 7.");
            }
        }
        scanner.close();

    }
}
