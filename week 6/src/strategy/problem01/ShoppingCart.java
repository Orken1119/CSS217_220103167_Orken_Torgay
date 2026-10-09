package strategy.problem01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> itemPrices = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(double price) {
        itemPrices.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (double p : itemPrices) {
            total += p;
        }
        return total;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Error: Please select a payment strategy before checking out!");
            return;
        }
        double total = calculateTotal();
        paymentStrategy.pay(total);
    }
}
