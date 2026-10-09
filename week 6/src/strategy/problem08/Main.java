package strategy.problem08;

public class Main {
    public static void main(String[] args) {
        double weight = 200.0;
        double distance = 1500.0;

        System.out.println("Cargo Details: " + weight + " kg, " + distance + " km\n");

        ShippingQuoteService service = new ShippingQuoteService(new StandardGroundShipping());
        double groundCost = service.getQuote(weight, distance);
        System.out.printf("Standard Ground Shipping: $%.2f%n", groundCost);

        service.setStrategy(new ExpressAirShipping());
        double airCost = service.getQuote(weight, distance);
        System.out.printf("Express Air Shipping:     $%.2f%n", airCost);

        service.setStrategy(new SeaFreightShipping());
        double seaCost = service.getQuote(weight, distance);
        System.out.printf("Sea Freight Shipping:     $%.2f%n", seaCost);
    }
}
