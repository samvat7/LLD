import Models.ICar;

public class Main{

    public static void main(String[] args){

        ICarBuilder builder = new ScorpioBuilder();

        Director director = new Director(builder);

        director.construct();

        ICar car = builder.build();

        ICarBuilder builder2 = new FortunerBuilder();

        Director director2 = new Director(builder2);

        director2.construct();

        ICar car2 = builder2.build(); 
    }
}