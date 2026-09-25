package task_1;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class PaymentGatewayAdapter implements IPaymentGateway{
    private final LegacyBillingSystem legacyBillingSystem;

    public PaymentGatewayAdapter(LegacyBillingSystem legacyService) {
        this.legacyBillingSystem = legacyService;
    }

    @Override 
    public void processPayment(int customerId, BigDecimal amountInDollars) {
        if (amountInDollars == null || amountInDollars.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount cannot be null or negative");
        }
        long amountInCents = amountInDollars.multiply(BigDecimal.valueOf(100)).longValueExact();

        legacyBillingSystem.chargeCustomerInCents(customerId, amountInCents);
    }
}
