package task_9;

public class TwoWaySpeedAdapter implements ISpeedInMph, ISpeedInKmh {
    private static final double KMH_PER_MPH = 1.60934;
    private static final double MPH_PER_KMH = 0.621371;

    private double speedInKmh;

    public TwoWaySpeedAdapter() {
        this.speedInKmh = 0.0;
    }

    public TwoWaySpeedAdapter(double initialSpeedInKmh) {
        this.speedInKmh = initialSpeedInKmh;
    }

    @Override
    public double getSpeedMph() {
        return speedInKmh * MPH_PER_KMH;
    }

    @Override
    public void setSpeedMph(double mph) {
        this.speedInKmh = mph * KMH_PER_MPH;
    }

    @Override
    public double getSpeedKmh() {
        return speedInKmh;
    }

    @Override
    public void setSpeedKmh(double kmh) {
        this.speedInKmh = kmh;
    }
}
