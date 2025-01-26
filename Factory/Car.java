package Factory;
import Factory.Models.IEngine;

public class Car {
    
    IEngine engine;

    IVehicleFactory carFactory;

    Car(IVehicleFactory factory){

        carFactory = factory;
    }

    public void driveCar(){

        carFactory.createEngine();

        System.out.println("Driving car now...");
    }
}
