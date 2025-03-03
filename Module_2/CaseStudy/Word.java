import java.util.ArrayList;
import java.util.List;

public class Word {
    private final String word;
    private final List<Definition> definitions;

    public Word(String word) {
        this.word = word;
        definitions = new ArrayList<>();
    }

    public String getWord() {
        return word;
    }

    public void addDefinition(Definition definition) {
        definitions.add(definition);
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
}
