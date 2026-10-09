package strategy.problem02;

public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        if (text == null) return "";
        return text.toUpperCase();
    }
}
