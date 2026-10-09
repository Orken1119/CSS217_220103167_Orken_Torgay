package strategy.problem10;

public class PostalCodeValidator implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        if (input == null) return false;
        String trimmed = input.trim();
        return trimmed.length() == 5 && trimmed.matches("\\d+");
    }
}
