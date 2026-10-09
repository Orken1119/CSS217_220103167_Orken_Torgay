package strategy.problem10;

public class InputField {
    private String label;
    private ValidationStrategy validator;

    public InputField(String label, ValidationStrategy validator) {
        this.label = label;
        this.validator = validator;
    }

    public void setValidator(ValidationStrategy validator) {
        this.validator = validator;
    }

    public boolean validate(String input) {
        if (validator == null) {
            return true;
        }
        return validator.validate(input);
    }

    public String getLabel() {
        return label;
    }
}
