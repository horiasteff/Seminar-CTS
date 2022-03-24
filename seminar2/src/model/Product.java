package model;

import exceptions.InvalidPriceValueException;
import exceptions.PercentageValueException;
import exceptions.PriceAmountException;
import exceptions.StringMinLengthException;


public class Product {
    private int id;
    private String name;
    private double price;
    private String description; // ex.: processor, memory, power, volume (for refrigerators etc)


    public Product(int id, String name, double price, String description) throws Exception {
        this.id = id;
        if(name.length() < 6){
            throw new StringMinLengthException("Input is too short");
        }else{
            this.name = name;
        }
        if(price < 0){
            throw new InvalidPriceValueException("Invalid price");
        }else{
            this.price = price;
        }
        this.description = description;
    }

    public Product(Product p) throws Exception
    {
        this.id = p.id;
        if(p.name.length() < 6){
            throw new StringMinLengthException("Input is too short");
        }else{
            this.name = p.name;
        }
        if(p.price < 0){
            throw new InvalidPriceValueException("Invalid price");
        }else{
            this.price = p.price;
        }
        this.description = p.description;
    }

    public boolean equals(Product p) {
        if((p.id != this.id) && (!p.name.equals(this.name)) && (p.price != this.price)){
            return false;
        }
        return true;
    }

    public void applyPercentageDiscount(float percentageDiscount) throws Exception{
        if(percentageDiscount < 0 || percentageDiscount > 1){
            throw new PercentageValueException("Invalid percentage");
        }else{
            this.price -= this.price* percentageDiscount / 100;
        }
    }

    public void applyAmountDiscount(double amountDiscount) throws Exception {
        if(amountDiscount > this.price){
            throw new PriceAmountException("Invalid amount");
        }
        this.price -= amountDiscount;
    }

    public void increasePricePercentage(float pricePercentage) throws Exception{
        if(pricePercentage < 0 || pricePercentage > 1){
            throw new PercentageValueException("Invalid percentage");
        }else{
            this.price += this.price* pricePercentage / 100;
        }
    }

    public void increasePriceAmount(double priceAmount) throws Exception{
        if(priceAmount > this.price){
            throw new PriceAmountException("Invalid amount");
        }
        this.price -= priceAmount;
    }
}
