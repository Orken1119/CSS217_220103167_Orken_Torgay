package strategy.problem07;

import java.util.List;

public class XmlExportStrategy implements ExportStrategy {
    @Override
    public void export(List<String> records) {
        System.out.println("--- XML Export ---");
        System.out.println("<records>");
        for (String r : records) {
            System.out.println("  <record>" + r + "</record>");
        }
        System.out.println("</records>");
    }
}
