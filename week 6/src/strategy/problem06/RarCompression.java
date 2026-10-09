package strategy.problem06;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using multi-volume RAR format -> " + fileName + ".rar");
    }
}
