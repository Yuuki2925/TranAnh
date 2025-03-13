public class Definition {
    private final String type;
    private final String meaning;

    public Definition(String type, String meaning) {
        this.type = type;
        this.meaning = meaning;
    }

    public String getType() {
        return type;
    }

    public String getMeaning() {
        return meaning;
    }

    @Override
    public String toString() {
        return type + ": " + meaning;
    }
}
