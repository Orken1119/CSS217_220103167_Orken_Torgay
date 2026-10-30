package week9.task24;

interface Device {
    void setVolume(int volume);
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }
}

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device d) {
        super(d);
    }

    public void mute() {
        device.setVolume(0);
    }
}
