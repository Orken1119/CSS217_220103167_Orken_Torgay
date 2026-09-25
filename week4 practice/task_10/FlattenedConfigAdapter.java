package task_10;

import java.util.Map;

public class FlattenedConfigAdapter implements IConfiguration {
    private final NestedConfigStore configStore;

    public FlattenedConfigAdapter(NestedConfigStore configStore) {
        this.configStore = configStore;
    }

    @Override
    public String getString(String dottedKey) {
        if (dottedKey == null || dottedKey.isEmpty()) {
            return null;
        }
        String[] parts = dottedKey.split("\\.");
        Map<String, Object> currentMap = configStore.getRawConfig();
        for (int i = 0; i < parts.length; i++) {
            if (currentMap == null) {
                return null;
            }
            Object val = currentMap.get(parts[i]);
            if (val == null) {
                return null;
            }
            if (i == parts.length - 1) {
                return String.valueOf(val);
            }
            if (val instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<String, Object> nextMap = (Map<String, Object>) val;
                currentMap = nextMap;
            } else {
                return null;
            }
        }
        return null;
    }
}
