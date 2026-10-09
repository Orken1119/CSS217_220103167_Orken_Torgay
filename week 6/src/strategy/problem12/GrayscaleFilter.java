package strategy.problem12;

public class GrayscaleFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageFileName) {
        System.out.println("Applying Grayscale filter to " + imageFileName + ": converting RGB to luminance monochrome.");
    }
}
