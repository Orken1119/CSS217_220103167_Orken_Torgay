package strategy.problem11;

public class Main {
    public static void main(String[] args) {
        AlertService alertService = new AlertService(new SmsNotification());

        System.out.println("--- Incident 1: Critical Server Outage ---");
        alertService.dispatch("+1-555-0199", "CRITICAL: Database instance db-01 is unreachable!");

        System.out.println("\n--- Incident 2: Escalation to On-Call via Push Notification ---");
        alertService.setStrategy(new PushNotification());
        alertService.dispatch("dev-ops-lead-phone-token", "ALERT: Disk usage on node worker-4 exceeds 92%");

        System.out.println("\n--- Routine Notice via Email ---");
        alertService.setStrategy(new EmailNotification());
        alertService.dispatch("admin@example.org", "INFO: Scheduled backup completed successfully.");
    }
}
