package week9.task09;

class RealStorage {
    void save(String name) {
        System.out.println("Saved: " + name);
    }
}

public class StorageProxy {
    RealStorage realStorage = new RealStorage();

    void save(String name) {
        System.out.println("Saving file...");
        realStorage.save(name);
    }
}
