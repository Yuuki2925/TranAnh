import java.io.*;
import java.util.*;

public class DictionaryManager implements IDictionaryManager {
    private final Map<String, Word> dictionary;

    public DictionaryManager() {
        dictionary = new HashMap<>();
    }

    @Override
    public void lookup(String keyword) {
        if (dictionary.containsKey(keyword)) {
            Word word = dictionary.get(keyword);
            System.out.println("Từ: " + word.getWord());
            for (Definition def : word.getDefinitions()) {
                System.out.println(" " + def);
            }
        } else {
            System.out.println("Không tìm thấy từ: " + keyword);
        }
    }

    @Override
    public void define(String type, String wordName, String meaning) {
        Word word = dictionary.getOrDefault(wordName, new Word(wordName));
        Definition definition = new Definition(type, meaning);
        word.addDefinition(definition);
        dictionary.put(wordName, word);
        System.out.println("Định nghĩa đã được thêm cho từ: " + wordName);
    }

    @Override
    public void drop(String keyword) {
        if (dictionary.containsKey(keyword)) {
            dictionary.remove(keyword);
            System.out.println("Từ " + keyword + " đã bị xóa.");
        } else {
            System.out.println("Từ không tồn tại: " + keyword);
        }
    }

    @Override
    public void export(String filePath) {
        Set<String> existingWords = getStrings(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Map.Entry<String, Word> entry : dictionary.entrySet()) {
                String word = entry.getKey();

                if (existingWords.contains(word)) {
                    System.out.println("Từ \"" + word + "\" đã có trong file.");
                } else {
                    bufferedWriter.write("Từ: " + word + "\n");
                    for (Definition def : entry.getValue().getDefinitions()) {
                        bufferedWriter.write("  " + def + "\n");
                    }
                    System.out.println("Từ \"" + word + "\" đã được thêm vào file.");
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi xuất dữ liệu: " + e.getMessage());
        }
    }

    @Override
    public void listAllWords() {
        if (dictionary.isEmpty()) {
            System.out.println("Từ điển hiện tại không có từ nào.");
        } else {
            System.out.println("Các từ hiện tại trong từ điển: ");
            for (String words : dictionary.keySet()) {
                System.out.println(words);
            }
        }
    }

    @Override
    public void editWord(String wordName, String newType, String newMeaning) {
        if (dictionary.containsKey(wordName)) {
            Word word = dictionary.get(wordName);
            Definition newDefinition = new Definition(newType, newMeaning);
            word.addDefinition(newDefinition);
            System.out.println("Định nghĩa của từ \"" + wordName + "\" đã được sửa.");
            export("./dicts.txt");
        } else {
            System.out.println("Từ không tồn tại: " + wordName);
        }
    }

    @Override
    public void sortWord() {
        List<String> sortedWords = new ArrayList<>(dictionary.keySet());
        Collections.sort(sortedWords);
        System.out.println("Danh sách từ sau khi sắp xếp:");
        for (String word : sortedWords) {
            System.out.println(word);
        }

        export("./dicts.txt");
    }

    private Set<String> getStrings(String filePath) {
        Set<String> existingWords = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("Từ: ")) {
                    existingWords.add(line.substring(4).trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return existingWords;
    }
}
