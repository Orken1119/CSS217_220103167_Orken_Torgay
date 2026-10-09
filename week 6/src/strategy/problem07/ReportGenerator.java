package strategy.problem07;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    private List<String> records;
    private ExportStrategy exportStrategy;

    public ReportGenerator(List<String> records) {
        this.records = records != null ? new ArrayList<>(records) : new ArrayList<>();
    }

    public void setExportStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void addRecord(String record) {
        this.records.add(record);
    }

    public void generateReport() {
        if (exportStrategy == null) {
            System.out.println("No export strategy selected.");
            return;
        }
        exportStrategy.export(records);
    }
}
