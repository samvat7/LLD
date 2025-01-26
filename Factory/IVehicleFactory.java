package Factory;
import Factory.Models.IEngine;

public interface IVehicleFactory {

    public IEngine createEngine();
}