package strategy.problem04;

public class Main {
    public static void main(String[] args) {
        NavigationApp nav = new NavigationApp(new DrivingRoute());
        System.out.println("--- Starting trip by Car ---");
        nav.goTo("Central Station", "Grand Bazaar");

        System.out.println("\n--- Heavy traffic detected! Switching to Walking mode ---");
        nav.setRouteStrategy(new WalkingRoute());
        nav.goTo("Central Station", "Grand Bazaar");

        System.out.println("\n--- Exploring other options ---");
        nav.setRouteStrategy(new BicycleRoute());
        nav.goTo("Central Station", "Grand Bazaar");

        nav.setRouteStrategy(new PublicTransitRoute());
        nav.goTo("Central Station", "Grand Bazaar");
    }
}
