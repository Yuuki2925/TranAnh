import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yuuki", 23);
        hashMap.put("Alice", 20);
        hashMap.put("Asuna", 20);
        hashMap.put("Kirito", 23);
        hashMap.put("Eugeo", 27);
        hashMap.put("Sinon", 25);

        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap: " + treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Yuuki", 23);
        linkedHashMap.put("Alice", 20);
        linkedHashMap.put("Asuna", 20);
        linkedHashMap.put("Kirito", 23);
        linkedHashMap.put("Eugeo", 27);
        linkedHashMap.put("Sinon", 25);
        System.out.println("LinkedHashMap: " + "Asuna is " + linkedHashMap.get("Asuna"));
    }
}
