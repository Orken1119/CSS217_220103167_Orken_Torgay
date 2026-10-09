package strategy.problem02;

public class KebabCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        if (text == null) return "";
        return text.trim().replaceAll("\\s+", "-").toLowerCase();
    }
}
