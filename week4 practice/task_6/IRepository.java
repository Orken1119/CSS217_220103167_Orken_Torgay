package task_6;

public interface IRepository {
    String findById(int id) throws RecordNotFoundException, DatabaseLockedException;
}
