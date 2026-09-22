public class BulbAdapter implements SmartDevice {
    private final LegacyBulb bulb;

    public BulbAdapter(LegacyBulb bulb) {
        if (bulb == null) {
            throw new IllegalArgumentException();
        }
        this.bulb = bulb;
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void turnOff() {
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public int getPowerPercent() {
        return 0;
    }
}
