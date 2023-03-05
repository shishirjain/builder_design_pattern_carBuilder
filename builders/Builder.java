package builders;
import cars.CarType;
import components.GPSNavigator;
import components.Engine;
import components.Transmission;
import components.TripComputer;

public interface Builder {
    CarBuilder setCarType(CarType type);
    Builder setSeats(int seats);
    CarBuilder setEngine(Engine engine);
    CarBuilder setTransmission(Transmission transmission);
    void serGPSNavigator(GPSNavigator gpsNavigator);

    CarBuilder setGPSNavigator(GPSNavigator gpsNavigator);

    CarBuilder setTripComputer(TripComputer tripComputer);
}
