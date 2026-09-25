package task_6;

public class DatabaseAdapter implements IRepository {
    private final LegacyDatabaseConnection connection;

    public DatabaseAdapter(LegacyDatabaseConnection connection) {
        this.connection = connection;
    }

    @Override
    public String findById(int id) throws RecordNotFoundException, DatabaseLockedException {
        String[] outBuffer = new String[1];
        int code = connection.executeFetch(id, outBuffer);
        if (code == -1) {
            throw new RecordNotFoundException("Record with id " + id + " not found");
        } else if (code == -2) {
            throw new DatabaseLockedException("Database is locked for record id: " + id);
        }
        return outBuffer[0];
    }
}
