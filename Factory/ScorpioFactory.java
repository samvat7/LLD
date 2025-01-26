package Factory;
import Factory.Models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory{

    public ScorpioEngine createEngine(){

        System.out.println("Making Scorpio engine...");

        return new ScorpioEngine();
    }
}