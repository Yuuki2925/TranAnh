public interface IProductManager {
    void addProduct(Product product);
    void editProduct();
    void removeProduct();
    void displayProduct();
    void searchProduct(String name);
    void sortProductsAscending();
    void sortProductsDescending();
}
