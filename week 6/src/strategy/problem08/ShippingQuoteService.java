package strategy.problem08;

public class ShippingQuoteService {
    private ShippingStrategy strategy;

    public ShippingQuoteService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getQuote(double weightKg, double distanceKm) {
        if (strategy == null) {
            return 0.0;
        }
        return strategy.calculateCost(weightKg, distanceKm);
    }
}
