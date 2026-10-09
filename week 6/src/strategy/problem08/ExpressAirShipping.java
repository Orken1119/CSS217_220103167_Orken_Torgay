package strategy.problem08;

public class ExpressAirShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return (2.50 * weightKg) + (0.40 * distanceKm);
    }
}
