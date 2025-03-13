public interface IDictionaryManager {
    void lookup(String keyword);
    void define(String type, String wordName, String meaning);
    void drop(String keyword);
    void export(String filePath);
    void listAllWords();
    void editWord(String wordName, String newType, String newMeaning);
    void sortWord();
}
