package director;
import builders.Builder;
import builders.CarBuilder;
import cars.CarType;
import components.GPSNavigator;
import components.Engine;
import components.Transmission;
import components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMIAUTOMATIC);
        builder.setTripComputer((new TripComputer()));
        builder.setGPSNavigator(new GPSNavigator());

    }

    public void constructCityCar(CarBuilder builder) {
        builder.setCarType(CarType.CITY_CAR).setSeats(4).setEngine(new Engine(1.2, 0))
                .setTransMission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }
    public void constructSUV(CarBuilder builder){
        builder.setCarType(CarType.SUV).
                setSeats(7).
                setEngine(new Engine(2.5, 0))
                .setTransMission(Transmission.MANUAL)
                .setGPSNavigator(new GPSNavigator());
    }
}
