package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OnlineShop o = new OnlineShop(1,"Emag", "logo.jpg");

        Product p1 = null;
        try {
            p1 = new Product(1, "Laptop", 150.5,"");
            Product p2 = new Product(2, "Frigider", 207.95,  "");
            Product p3 = new Product(p1);

            o.addProductToList(p1);
            o.addProductToList(p2);
            o.addProductToList(p3);

            o.removeProductToList(p1);
            System.out.println(p1.equals(p2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
