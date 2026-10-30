package week9.task12;

class RealWorker {
    void doWork() {
        System.out.println("Working");
    }
}

public class BuggyProxyFixed {
    RealWorker real;

    void run() {
        if (real == null) real = new RealWorker();
        real.doWork();
    }
}
