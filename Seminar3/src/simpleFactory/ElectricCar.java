package simpleFactory;

import simpleFactory.Car;

public class ElectricCar implements Car {
    @Override
    public void showInfo() {
        System.out.println("Electric car");
    }
}
