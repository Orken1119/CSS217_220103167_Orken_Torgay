package strategy.problem06;

public class GzipCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using UNIX GZIP stream -> " + fileName + ".gz");
    }
}
