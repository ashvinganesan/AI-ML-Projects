import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.acos;

public class City {

    private String name;
    private State state;
    private double latitude;
    private double longitude;

    public City(String name, State state, double latitude, double longitude) {
        this.name = name;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String name() { return this.name; }
    public State state() { return this.state; }
    public double latitude() { return this.latitude; }
    public double longitude() { return this.longitude; }


    public double distance(City to) {
        final double earthRadius = 6335.439; // kilometers
        double phi1 = Math.toRadians(this.latitude);
        double phi2 = Math.toRadians(to.latitude);
        double lambda1 = Math.toRadians(this.longitude);
        double lambda2 = Math.toRadians(to.longitude);
        double deltaLambda = lambda2 - lambda1;

        double centralAngle = acos(sin(phi1) * sin(phi2) +
                                   cos(phi1) * cos(phi2) * cos(deltaLambda));

        return earthRadius * centralAngle;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.state.code();
    }

}
