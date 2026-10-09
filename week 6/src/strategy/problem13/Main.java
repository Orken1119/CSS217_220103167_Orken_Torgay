package strategy.problem13;

public class Main {
    public static void main(String[] args) {
        double subtotal = 250.0;
        Invoice invoice = new Invoice(subtotal, new DomesticTax());

        System.out.printf("Base Invoice Subtotal: $%.2f%n%n", subtotal);

        System.out.println("--- Jurisdiction 1: Domestic Tax (8%) ---");
        System.out.printf("Tax: $%.2f | Total: $%.2f%n", invoice.calculateTax(), invoice.calculateTotal());

        System.out.println("\n--- Jurisdiction 2: EU VAT (20%) ---");
        invoice.setTaxStrategy(new EuVatTax());
        System.out.printf("Tax: $%.2f | Total: $%.2f%n", invoice.calculateTax(), invoice.calculateTotal());

        System.out.println("\n--- Jurisdiction 3: Zero Tax (0% Duty-Free) ---");
        invoice.setTaxStrategy(new ZeroTax());
        System.out.printf("Tax: $%.2f | Total: $%.2f%n", invoice.calculateTax(), invoice.calculateTotal());
    }
}
