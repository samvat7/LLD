package Factory;
import Factory.Models.DefenderEngine;
import Factory.Models.IEngine;

public class DefenderFactory implements IVehicleFactory {
    
    public IEngine createEngine(){

        System.out.println("Making Defender engine...");

        return new DefenderEngine();
    }
}
