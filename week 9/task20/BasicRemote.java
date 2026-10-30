package week9.task20;

interface Device {
    void turnOn();
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }
}

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device d) {
        super(d);
    }

    public void powerOn() {
        device.turnOn();
    }
}
