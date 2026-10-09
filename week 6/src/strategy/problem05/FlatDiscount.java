package strategy.problem05;

public class FlatDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawPrice) {
        double discounted = rawPrice - 15.0;
        return discounted < 0.0 ? 0.0 : discounted;
    }
}
