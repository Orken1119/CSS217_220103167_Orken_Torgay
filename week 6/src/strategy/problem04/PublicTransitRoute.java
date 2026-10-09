package strategy.problem04;

public class PublicTransitRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Checking metro line 1 and bus feeder schedules from " + start + " to " + destination + " (est. 20 mins).");
    }
}
