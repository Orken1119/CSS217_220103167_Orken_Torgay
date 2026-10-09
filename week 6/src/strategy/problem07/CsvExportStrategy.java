package strategy.problem07;

import java.util.List;

public class CsvExportStrategy implements ExportStrategy {
    @Override
    public void export(List<String> records) {
        System.out.println("--- CSV Export ---");
        System.out.println("id,record_data");
        int id = 1;
        for (String r : records) {
            System.out.println((id++) + "," + r);
        }
    }
}
