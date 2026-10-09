package strategy.problem11;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Dispatching PUSH NOTIFICATION to device [" + recipient + "]: " + message);
    }
}
