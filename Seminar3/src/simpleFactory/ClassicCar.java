package simpleFactory;

import simpleFactory.Car;

public class ClassicCar implements Car {
    @Override
    public void showInfo() {
        System.out.println("Classic car");
    }
}
