package strategy.problem06;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using standard ZIP algorithm -> " + fileName + ".zip");
    }
}
