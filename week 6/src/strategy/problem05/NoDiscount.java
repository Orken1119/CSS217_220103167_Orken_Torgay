package strategy.problem05;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawPrice) {
        return rawPrice;
    }
}
