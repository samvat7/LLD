import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder{

    Scorpio s1;
    
    @Override
    public void buildEngine(){

        System.out.println("Building Scorpio Engine...");
    }

    @Override
    public void buildChasis(){

        System.out.println("Building Scorpio Chasis...");
    }

    @Override
    public void buildBodyShell(){

        System.out.println("Building Scorpio Body Shell...");
    }

    @Override
    public void buildTyre(){

        System.out.println("Building Scorpio Tyre...");
    }

    @Override
    public Scorpio build(){

        System.out.println("Scorpio is now ready!");
        return s1;
    }


}