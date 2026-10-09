package strategy.problem08;

public class SeaFreightShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return (0.15 * weightKg) + (0.02 * distanceKm);
    }
}
