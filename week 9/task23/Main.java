package week9.task23;

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

class SwitchableRemote {
    Device d;

    SwitchableRemote(Device d) {
        this.d = d;
    }

    void setDevice(Device newDevice) {
        this.d = newDevice;
    }

    void press() {
        d.turnOn();
    }
}

public class Main {
    public static void main(String[] args) {
        SwitchableRemote sr = new SwitchableRemote(new TV());
        sr.press();
        sr.setDevice(new Radio());
        sr.press();
    }
}
