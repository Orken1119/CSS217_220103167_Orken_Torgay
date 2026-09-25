package task_2;

public class TemperatureSensorAdapter implements ICelsiusSensor {
    private final FahrenheitSensor fahrenheitSensor;

    public TemperatureSensorAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        String raw = fahrenheitSensor.readRawTemperature();
        String cleaned = raw.replace(" F", "").trim();
        double fahrenheit = Double.parseDouble(cleaned);
        double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
        return Math.round(celsius * 100.0) / 100.0;
    }
}
