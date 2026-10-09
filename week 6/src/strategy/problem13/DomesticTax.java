package strategy.problem13;

public class DomesticTax implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.08;
    }
}
