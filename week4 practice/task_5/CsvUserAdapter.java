package task_5;

public class CsvUserAdapter implements IUserSource {
    private final LegacyCsvUserStore legacyStore;

    public CsvUserAdapter(LegacyCsvUserStore legacyStore) {
        this.legacyStore = legacyStore;
    }

    @Override
    public UserProfile getNextUser() {
        String row = legacyStore.fetchNextRow();
        if (row == null || row.isBlank()) {
            throw new IllegalStateException("Invalid or empty row from legacy user store");
        }
        String[] parts = row.split(",");
        if (parts.length < 3) {
            throw new IllegalStateException("Malformed CSV row: " + row);
        }
        try {
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String role = parts[2].trim();
            return new UserProfile(id, name, role);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Failed to parse user ID: " + parts[0], e);
        }
    }
}
