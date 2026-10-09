package strategy.problem05;

public class PercentageDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawPrice) {
        return rawPrice * 0.80;
    }
}
