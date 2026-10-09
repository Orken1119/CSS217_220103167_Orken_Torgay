package strategy.problem13;

public class ZeroTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return 0.0;
    }
}
