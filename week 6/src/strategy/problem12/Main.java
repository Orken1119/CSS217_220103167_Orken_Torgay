package strategy.problem12;

public class Main {
    public static void main(String[] args) {
        String targetImage = "sunset.png";
        ImageProcessor processor = new ImageProcessor(targetImage, new SepiaFilter());

        System.out.println("--- Step 1: Applying Sepia ---");
        processor.process();

        System.out.println("\n--- Step 2: Switching to Grayscale ---");
        processor.setFilter(new GrayscaleFilter());
        processor.process();

        System.out.println("\n--- Step 3: Trying Invert Colors ---");
        processor.setFilter(new InvertColorsFilter());
        processor.process();
    }
}
