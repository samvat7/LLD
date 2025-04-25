public class AircraftOne {

    // Lazy Initialization

    private static AircraftOne aircraftInstance;

    private AircraftOne(){

        System.out.println("Inside constructor");
    }

    public static AircraftOne getInstance(){

        if(aircraftInstance == null){

            aircraftInstance = new AircraftOne();

            return aircraftInstance;
        }

        else return aircraftInstance;
    }

    public static void main(String[] args){

        Thread t1 = new Thread( () -> { AircraftOne.getInstance(); });
        Thread t2 = new Thread( () -> { AircraftOne.getInstance(); });

        t1.start();

        t2.start();

    }
}