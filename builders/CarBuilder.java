package builders;
import cars.Car;
import cars.CarType;
import components.GPSNavigator;
import components.Engine;
import components.Transmission;
import components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public void serGPSNavigator(GPSNavigator gpsNavigator) {

    }

    @Override
    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    public CarBuilder setTransMission(Transmission transmission) {
        this.transmission=transmission;
        return this;
    }
    public Car getResult(){
        return new Car(type,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
