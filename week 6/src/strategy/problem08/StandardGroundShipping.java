package strategy.problem08;

public class StandardGroundShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return (0.50 * weightKg) + (0.10 * distanceKm);
    }
}
