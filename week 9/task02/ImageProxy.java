package week9.task02;

class RealImage {
    void show() {
        System.out.println("Displaying image");
    }
}

public class ImageProxy {
    RealImage realImage;

    void show() {
        if (realImage == null) realImage = new RealImage();
        realImage.show();
    }
}
