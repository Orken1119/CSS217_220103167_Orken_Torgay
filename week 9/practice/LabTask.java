interface Sender {
    void send(String message);
}

class EmailSender implements Sender {
    public void send(String message) {
        System.out.println("[Email] " + message);
    }
}

class SmsSender implements Sender {
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}

abstract class Notification {
    protected Sender sender;

    public Notification(Sender sender) {
        this.sender = sender;
    }

    public abstract void deliver(String text);
}

class StandardAlert extends Notification {
    public StandardAlert(Sender sender) {
        super(sender);
    }

    public void deliver(String text) {
        sender.send("INFO: " + text);
    }
}

class UrgentAlert extends Notification {
    public UrgentAlert(Sender sender) {
        super(sender);
    }

    public void deliver(String text) {
        sender.send("CRITICAL: " + text + " [ACK REQUIRED]");
    }
}

class SenderLoggingProxy implements Sender {
    private Sender realSender;
    private int sendCount = 0;

    public SenderLoggingProxy(Sender realSender) {
        this.realSender = realSender;
    }

    public void send(String message) {
        sendCount++;
        System.out.println("[AUDIT] Preparing transmission #" + sendCount + "...");
        realSender.send(message);
        System.out.println("[AUDIT] Transmission complete.");
    }
}

public class LabTask {
    public static void main(String[] args) {
        System.out.println("--- Test 1: Standard Alert via SMS (No Proxy) ---");
        Sender directSms = new SmsSender();
        Notification alert1 = new StandardAlert(directSms);
        alert1.deliver("Lab session starts in 10 minutes.");

        System.out.println();

        System.out.println("--- Test 2: Urgent Alert via Proxied Email ---");
        Sender realEmail = new EmailSender();
        Sender proxiedEmail = new SenderLoggingProxy(realEmail);
        Notification alert2 = new UrgentAlert(proxiedEmail);
        alert2.deliver("Database connection failed!");

        System.out.println();

        System.out.println("--- Test 3: Second Alert through Same Proxy ---");
        alert2.deliver("Disk space low on /dev/sda1");
    }
}
