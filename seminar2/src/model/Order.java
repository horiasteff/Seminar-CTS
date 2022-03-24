package model;

import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<Product> productList;
    private String address;

    public Order(int id)
    {
        this.id = id;
        productList = new ArrayList<>();
    }
    public void addProductToList(Product p)
    {
        if(productList.size() > 99)
            return;
        productList.add(p);
    }

    public void removeProduct(Product p)
    {
        productList.remove(p);
    }


}
