package task_14;

import java.util.LinkedHashMap;
import java.util.Map;

public class TelemetryFeedAdapter implements ITelemetryService {
    private final LegacySensorFeed sensorFeed;

    public TelemetryFeedAdapter(LegacySensorFeed sensorFeed) {
        this.sensorFeed = sensorFeed;
    }

    @Override
    public Map<String, String> getCleanTelemetry() {
        Map<String, String> telemetryMap = new LinkedHashMap<>();
        String raw = sensorFeed.getRawTelemetry();
        if (raw == null || raw.isBlank()) {
            return telemetryMap;
        }
        String[] tokens = raw.split(";");
        for (String token : tokens) {
            String trimmed = token.trim();
            if (trimmed.contains("=")) {
                String[] parts = trimmed.split("=", 2);
                if (parts.length == 2 && !parts[0].trim().isEmpty()) {
                    telemetryMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        }
        return telemetryMap;
    }
}
