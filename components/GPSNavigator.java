package components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route="vigyan Nagar to kanchipuram";
    }
    public GPSNavigator(String manualRoute){
        this.route=manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
