package strategy.problem10;

public class EmailValidator implements ValidationStrategy {
    @Override
    public boolean validate(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        return input.contains("@") && input.contains(".");
    }
}
