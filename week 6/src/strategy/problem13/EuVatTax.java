package strategy.problem13;

public class EuVatTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.20;
    }
}
