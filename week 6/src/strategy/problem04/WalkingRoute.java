package strategy.problem04;

public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Mapping direct pedestrian sidewalks and parks from " + start + " to " + destination + " (est. 15 mins walking).");
    }
}
