package week9.task10;

class SlowCalcProxy {
    String cached = null;

    void calculate() {
        if (cached == null) {
            System.out.print("SLOW_CALC ");
            cached = "RESULT";
        } else {
            System.out.print("FROM_CACHE ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SlowCalcProxy cp = new SlowCalcProxy();
        cp.calculate();
        cp.calculate();
    }
}
