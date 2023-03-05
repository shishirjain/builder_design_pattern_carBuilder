
import builders.CarBuilder;
import cars.Car;
import director.Director;
public class client {
    public static void main(String []args){
        Director director=new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);
        Car car=builder.getResult();
        System.out.println("car built:"+car.getCarType()+car.getSeats());
    }
}
