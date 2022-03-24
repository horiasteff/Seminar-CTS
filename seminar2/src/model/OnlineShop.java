package model;

import java.util.ArrayList;

public class OnlineShop {
    private int id;
    private String name;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(int id, String name, String image)
    {
        this.id = id;
        this.products = new ArrayList<>();
        this.image = image;
        this.name = name;
    }

    public void addProductToList(Product product){
        this.products.add(product);
    }

    public void removeProductToList(Product product){
        this.products.remove(product);
    }
}
