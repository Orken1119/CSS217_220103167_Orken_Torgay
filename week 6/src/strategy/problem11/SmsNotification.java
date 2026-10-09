package strategy.problem11;

public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Dispatching SMS via cellular gateway to [" + recipient + "]: " + message);
    }
}
