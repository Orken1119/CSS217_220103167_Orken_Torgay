package week9.task21;

interface Device {
    void turnOn();
}

class TV implements Device {
    public void turnOn() {
        System.out.print("TV-ON ");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.print("RADIO-ON ");
    }
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }
}

class BasicRemote extends RemoteControl {
    public BasicRemote(Device d) {
        super(d);
    }

    public void powerOn() {
        device.turnOn();
    }
}

public class Main {
    public static void main(String[] args) {
        BasicRemote r1 = new BasicRemote(new TV());
        BasicRemote r2 = new BasicRemote(new Radio());
        r1.powerOn();
        r2.powerOn();
    }
}
