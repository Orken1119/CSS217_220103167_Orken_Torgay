package strategy.problem04;

public class DrivingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Calculating fastest driving route via highways from " + start + " to " + destination + " (est. 25 mins by car).");
    }
}
