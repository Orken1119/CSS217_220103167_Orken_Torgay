package strategy.problem05;

public class Order {
    private double basePrice;
    private DiscountStrategy discountStrategy;

    public Order(double basePrice, DiscountStrategy discountStrategy) {
        this.basePrice = basePrice;
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice() {
        if (discountStrategy == null) {
            return basePrice;
        }
        return discountStrategy.applyDiscount(basePrice);
    }
}
