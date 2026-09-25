package task_11;

public class BoxAdapter implements IImperialBox {
    private final MetricBox metricBox;

    public BoxAdapter(MetricBox metricBox) {
        this.metricBox = metricBox;
    }

    @Override
    public double getWidthInches() {
        return metricBox.getWidthCm() / 2.54;
    }

    @Override
    public double getHeightInches() {
        return metricBox.getHeightCm() / 2.54;
    }

    @Override
    public double getAreaSquareInches() {
        return getWidthInches() * getHeightInches();
    }
}
