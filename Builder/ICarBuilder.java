import Models.ICar;

public interface ICarBuilder {

    public void buildEngine();

    public void buildChasis();

    public void buildTyre();

    public void buildBodyShell();

    public ICar build();
}