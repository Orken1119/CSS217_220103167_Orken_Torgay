package strategy.problem04;

public class NavigationApp {
    private RouteStrategy routeStrategy;

    public NavigationApp(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void goTo(String start, String destination) {
        if (routeStrategy == null) {
            System.out.println("Please pick a travel mode first.");
            return;
        }
        routeStrategy.buildRoute(start, destination);
    }
}
