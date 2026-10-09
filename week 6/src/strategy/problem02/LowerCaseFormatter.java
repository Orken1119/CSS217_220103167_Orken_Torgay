package strategy.problem02;

public class LowerCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        if (text == null) return "";
        return text.toLowerCase();
    }
}
