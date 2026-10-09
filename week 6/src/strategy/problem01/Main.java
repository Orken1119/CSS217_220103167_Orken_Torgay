package strategy.problem01;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(45.50);
        cart.addItem(15.00);
        cart.addItem(9.50);

        System.out.println("--- Customer selects Credit Card ---");
        cart.setPaymentStrategy(new CreditCardPayment("4111-2222-3333-4444", "Alice Smith"));
        cart.checkout();

        System.out.println("\n--- Customer changes mind and switches to PayPal ---");
        cart.setPaymentStrategy(new PayPalPayment("alice.smith@example.com"));
        cart.checkout();

        System.out.println("\n--- Customer decides to pay with Crypto ---");
        cart.setPaymentStrategy(new CryptoPayment("0x71C...9B8"));
        cart.checkout();
    }
}
