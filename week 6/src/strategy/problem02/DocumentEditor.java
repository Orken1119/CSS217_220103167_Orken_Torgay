package strategy.problem02;

public class DocumentEditor {
    private String text;
    private TextFormatter formatter;

    public DocumentEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String render() {
        if (formatter == null) {
            return text;
        }
        return formatter.format(text);
    }
}
