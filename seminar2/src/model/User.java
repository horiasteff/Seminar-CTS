package model;

import exceptions.IdentifierValueException;
import exceptions.StringMinLengthException;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String name;
    private ArrayList<Order> orderHistory; //orders
    private ArrayList<Order> shoppingCart; //cosul de cumparaturi //TODO: definim o clasa noua de tipul Cart

    public User(String username, int id, String name) throws Exception {
        if(username.length() < 5){
            throw new StringMinLengthException();
        }else{
            this.username = username;
        }
        if(id < 1){
            throw new IdentifierValueException();
        }else{
            this.id = id;
        }
        if(name.length() < 10){
            throw new StringMinLengthException();
        }else{
            this.name = name;
        }

        orderHistory =new ArrayList<Order>();
    }

    public void addOrderToHistory(Order o)
    {
        this.orderHistory.add(o);
    }

    public void addProductToCart(Product p)
    {
       // this.shoppingCart.add(o);
    }
}
