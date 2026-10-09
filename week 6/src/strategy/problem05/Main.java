package strategy.problem05;

public class Main {
    public static void main(String[] args) {
        double orderAmount = 100.0;
        Order order = new Order(orderAmount, new FlatDiscount());

        System.out.println("Base Order Amount: $" + String.format("%.2f", orderAmount));

        System.out.println("With Flat Discount (-$15): $" + String.format("%.2f", order.calculateFinalPrice()));

        order.setDiscountStrategy(new PercentageDiscount());
        System.out.println("With Percentage Discount (-20%): $" + String.format("%.2f", order.calculateFinalPrice()));

        order.setDiscountStrategy(new NoDiscount());
        System.out.println("With No Discount: $" + String.format("%.2f", order.calculateFinalPrice()));
    }
}
