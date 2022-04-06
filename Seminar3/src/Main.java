import simpleFactory.Car;
import simpleFactory.CarFactory;
import singleton.OnlineShop;

public class Main {

    public static void main(String[] args) {
        //IMPLEMENTARE SINGLETON
        OnlineShop onlineShop = OnlineShop.getInstance();
        OnlineShop onlineShop2 = OnlineShop.getInstance();

        onlineShop2.setInfo("another info");

        System.out.println(onlineShop.getInfo());
        System.out.println(onlineShop2.getInfo());

        //IMPLEMENTARE SIMPLE FACTORY

    Car c1 = CarFactory.createCar("ELECTRIC");
    Car c2 = CarFactory.createCar("CLASSIC");


    }
}
