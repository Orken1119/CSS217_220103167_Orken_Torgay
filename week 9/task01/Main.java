package week9.task01;

class RealBook {
    RealBook() {
        System.out.print("Loaded ");
    }
}

class BookProxy {
    RealBook b = null;

    void open() {
        if (b == null) b = new RealBook();
        System.out.print("Open ");
    }
}

public class Main {
    public static void main(String[] args) {
        BookProxy p = new BookProxy();
        p.open();
        p.open();
    }
}
