package strategy.problem11;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Dispatching EMAIL to [" + recipient + "]: " + message);
    }
}
