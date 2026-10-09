package strategy.problem10;

public class Main {
    public static void main(String[] args) {
        InputField field = new InputField("User Input", new EmailValidator());

        String[] testEmails = {"user@example.com", "invalid-email", "orken@sdu.edu.kz"};
        System.out.println("--- Validating with EmailValidator ---");
        for (String email : testEmails) {
            System.out.println("'" + email + "' -> valid: " + field.validate(email));
        }

        System.out.println("\n--- Validating with PhoneNumberValidator ---");
        field.setValidator(new PhoneNumberValidator());
        String[] testPhones = {"7701123456", "12345", "7701abcdef", "7708999888"};
        for (String phone : testPhones) {
            System.out.println("'" + phone + "' -> valid: " + field.validate(phone));
        }

        System.out.println("\n--- Validating with PostalCodeValidator ---");
        field.setValidator(new PostalCodeValidator());
        String[] testCodes = {"05000", "A5000", "123", "90210"};
        for (String code : testCodes) {
            System.out.println("'" + code + "' -> valid: " + field.validate(code));
        }
    }
}
