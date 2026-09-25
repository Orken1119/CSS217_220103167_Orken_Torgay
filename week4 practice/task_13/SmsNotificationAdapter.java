package task_13;

public class SmsNotificationAdapter implements IPushNotifier {
    private final ThirdPartySmsProvider smsProvider;

    public SmsNotificationAdapter(ThirdPartySmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    @Override
    public void notify(AlertMessage alert) {
        if (alert == null) {
            throw new IllegalArgumentException("Alert cannot be null");
        }
        String phone = alert.userPhone();
        if (phone != null && !phone.startsWith("+")) {
            phone = "+" + phone;
        }
        String message = "[" + alert.title() + "] " + alert.body();
        smsProvider.sendSms(phone, message);
    }
}
