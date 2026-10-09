package strategy.problem06;

import java.util.List;

public class FileArchiver {
    private CompressionStrategy strategy;

    public FileArchiver(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void archiveFile(String file) {
        if (strategy == null) {
            System.out.println("No compression strategy selected.");
            return;
        }
        strategy.compress(file);
    }

    public void archiveBatch(List<String> files) {
        if (strategy == null) {
            System.out.println("No compression strategy selected.");
            return;
        }
        for (String f : files) {
            strategy.compress(f);
        }
    }
}
