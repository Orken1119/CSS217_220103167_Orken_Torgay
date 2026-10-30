package week9.task27;

interface Color {
    String get();
}

class Red implements Color {
    public String get() {
        return "RED";
    }
}

class Blue implements Color {
    public String get() {
        return "BLUE";
    }
}

class Circle {
    Color color;

    Circle(Color c) {
        this.color = c;
    }

    void draw() {
        System.out.print("CIRCLE-" + color.get() + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        new Circle(new Red()).draw();
        new Circle(new Blue()).draw();
    }
}
