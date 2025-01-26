public class Director {
    
    // directs builder

    ICarBuilder carBuilder;

    public Director(ICarBuilder builder){

        this.carBuilder = builder;
    }

    //instruction

    public void construct(){

        carBuilder.buildEngine();
        carBuilder.buildChasis();
        carBuilder.buildTyre();
        carBuilder.buildBodyShell();

        
    }
}
