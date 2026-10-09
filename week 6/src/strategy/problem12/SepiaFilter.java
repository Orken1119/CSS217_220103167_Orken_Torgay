package strategy.problem12;

public class SepiaFilter implements FilterStrategy {
    @Override
    public void applyFilter(String imageFileName) {
        System.out.println("Applying Sepia filter to " + imageFileName + ": adding warm reddish-brown vintage tone.");
    }
}
