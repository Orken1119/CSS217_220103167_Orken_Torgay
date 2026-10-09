package strategy.problem07;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
            "Alice - CS Year 2 - GPA 3.8",
            "Bob - SE Year 2 - GPA 3.5",
            "Charlie - CS Year 3 - GPA 3.9"
        );

        ReportGenerator generator = new ReportGenerator(students);

        generator.setExportStrategy(new CsvExportStrategy());
        generator.generateReport();

        System.out.println();
        generator.setExportStrategy(new JsonExportStrategy());
        generator.generateReport();

        System.out.println();
        generator.setExportStrategy(new XmlExportStrategy());
        generator.generateReport();
    }
}
