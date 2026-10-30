package week9.task08;

class RealWorker {
    void doTask() {
        System.out.print("TASK ");
    }
}

class LogProxy {
    RealWorker w = new RealWorker();

    void doTask() {
        System.out.print("START-");
        w.doTask();
        System.out.print("-END ");
    }
}

public class Main {
    public static void main(String[] args) {
        new LogProxy().doTask();
    }
}
