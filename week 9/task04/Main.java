package week9.task04;

class HeavyService {
    HeavyService() {
        System.out.print("HeavyCreated ");
    }
}

class ServiceProxy {
    HeavyService service;

    ServiceProxy() {
        System.out.print("ProxyReady ");
    }
}

public class Main {
    public static void main(String[] args) {
        ServiceProxy sp = new ServiceProxy();
    }
}
