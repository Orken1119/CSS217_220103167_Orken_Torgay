package strategy.problem13;

public class Invoice {
    private double amount;
    private TaxStrategy taxStrategy;

    public Invoice(double amount, TaxStrategy taxStrategy) {
        this.amount = amount;
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getAmount() {
        return amount;
    }

    public double calculateTax() {
        if (taxStrategy == null) {
            return 0.0;
        }
        return taxStrategy.calculateTax(amount);
    }

    public double calculateTotal() {
        return amount + calculateTax();
    }
}
