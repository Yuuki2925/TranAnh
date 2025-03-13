import java.util.*;

public class ProductManager implements IProductManager {
    private final List<Product> products;
    private final Scanner scanner;

    public ProductManager() {
        products = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public boolean isIdExists(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct() {
        System.out.print("Enter your ID want to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Enter new product: ");
                String name = scanner.nextLine();
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                product.setName(name);
                product.setPrice(price);
                found = true;
                System.out.println("Update successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Product ID not found");
        }
    }

    @Override
    public void removeProduct() {
        System.out.print("Enter your ID want to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product ID not found");
        }
    }

    @Override
    public void displayProduct() {
        if (!products.isEmpty()) {
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("No product");
        }
    }

    @Override
    public void searchProduct(String name) {
        boolean found = false;
        for(Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No products matching your search");
        }
    }

    @Override
    public void sortProductsAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Products sorted in ascending order by price:");
        displayProduct();
    }

    @Override
    public void sortProductsDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Products sorted in descending order by price:");
        displayProduct();
    }
}
