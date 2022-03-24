package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = null;
        try {
            p1 = new Product(1, "Laptop", 150.5,"");
            Product p2 = new Product(2, "Frigider", 207.95,  "");
            Product p3 = new Product(p1);
            o.modifyProductsList(1,p1);
            o.modifyProductsList(1,p2);

            o.modifyProductsList(2, p1);
            System.out.println(p1.equals(p2));

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
