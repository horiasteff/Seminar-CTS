package model;

public class InventoryProduct {
    private Product product;
    private int quantity;

    public InventoryProduct(Product product, int quantity) throws Exception {
        this.product = new Product(product);
        this.quantity = quantity;
    }
}
