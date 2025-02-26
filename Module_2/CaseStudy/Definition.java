public class Definition {
    private final String type;
    private final String meaning;
    private final String example;

    public Definition(String type, String meaning, String example) {
        this.type = type;
        this.meaning = meaning;
        this.example = example;
    }

    public String getType() {
        return type;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getExample() {
        return example;
    }

    @Override
    public String toString() {
        return type + ": " + meaning + (example.isEmpty() ? "" : " (Example: " + example + ")");
    }
}
