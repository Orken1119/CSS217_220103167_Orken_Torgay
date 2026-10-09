package strategy.problem11;

public class AlertService {
    private NotificationStrategy strategy;

    public AlertService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void dispatch(String recipient, String message) {
        if (strategy == null) {
            System.out.println("No notification provider set.");
            return;
        }
        strategy.send(recipient, message);
    }
}
