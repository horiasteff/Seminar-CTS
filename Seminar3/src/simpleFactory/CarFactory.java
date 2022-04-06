package simpleFactory;

import simpleFactory.Car;

public class CarFactory {

    public static Car createCar(String type){
        if(type.equals("ELECTRIC")){
            Car car = new ElectricCar();
            return car;
        }else if(type.equals("CLASSIC")){
            Car car = new ClassicCar();
            return car;
        }else{
            return null;
        }
    }
}
