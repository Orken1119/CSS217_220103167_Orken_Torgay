package strategy.problem10;

public class PhoneNumberValidator implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        if (input == null) return false;
        String trimmed = input.trim();
        return trimmed.length() == 10 && trimmed.matches("\\d+");
    }
}
