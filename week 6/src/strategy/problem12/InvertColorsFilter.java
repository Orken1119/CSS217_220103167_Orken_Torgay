package strategy.problem12;

public class InvertColorsFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageFileName) {
        System.out.println("Applying Invert Colors filter to " + imageFileName + ": flipping all color channels (255 - value).");
    }
}
