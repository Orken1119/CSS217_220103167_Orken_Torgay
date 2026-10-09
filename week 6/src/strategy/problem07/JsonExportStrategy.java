package strategy.problem07;

import java.util.List;

public class JsonExportStrategy implements ExportStrategy {
    @Override
    public void export(List<String> records) {
        System.out.println("--- JSON Export ---");
        System.out.println("[");
        for (int i = 0; i < records.size(); i++) {
            String trailing = (i == records.size() - 1) ? "" : ",";
            System.out.println("  {\"id\": " + (i + 1) + ", \"record\": \"" + records.get(i) + "\"}" + trailing);
        }
        System.out.println("]");
    }
}
