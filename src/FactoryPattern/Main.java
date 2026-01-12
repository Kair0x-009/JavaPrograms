package FactoryPattern;

public class Main {
    public static void main(String[] args){
        VehicleFactory factory ;
        factory = new TwoWheelerFactory();
        Vehicle bike = factory.createVehicle();
        bike.printVehicle();

        factory = new FourWheelerFactory();
        Vehicle car = factory.createVehicle();
        car.printVehicle();
    }
}
