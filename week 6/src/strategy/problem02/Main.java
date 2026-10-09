package strategy.problem02;

public class Main {
    public static void main(String[] args) {
        String sample = "Design Patterns In Modern Java";
        DocumentEditor editor = new DocumentEditor(sample);

        System.out.println("Original: " + sample);

        editor.setFormatter(new UpperCaseFormatter());
        System.out.println("Uppercase: " + editor.render());

        editor.setFormatter(new LowerCaseFormatter());
        System.out.println("Lowercase: " + editor.render());

        editor.setFormatter(new KebabCaseFormatter());
        System.out.println("Kebab-case: " + editor.render());
    }
}
