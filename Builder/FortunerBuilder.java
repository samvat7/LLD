import Models.ICar;
import Models.Fortuner;

public class FortunerBuilder implements ICarBuilder{

    Fortuner s1;
    
    @Override
    public void buildEngine(){

        System.out.println("Building Fortuner Engine...");
    }

    @Override
    public void buildChasis(){

        System.out.println("Building Fortuner Chasis...");
    }

    @Override
    public void buildBodyShell(){

        System.out.println("Building Fortuner Body Shell...");
    }

    @Override
    public void buildTyre(){

        System.out.println("Building Fortuner Tyre...");
    }

    @Override
    public Fortuner build(){

        System.out.println("Fortuner is now ready!");

        return s1;
    }


}