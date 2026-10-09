package strategy.problem04;

public class BicycleRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Finding dedicated bike trails and lanes from " + start + " to " + destination + " (est. 40 mins by bicycle).");
    }
}
