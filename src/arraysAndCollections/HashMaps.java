package arraysAndCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);
        wordCount.put("orange", 5);
        wordCount.put("apple", 4);
        int appleCount = wordCount.get("apple"); // Returns 4
        int bananaCount = wordCount.get("banana");

        System.out.println(appleCount + " " + bananaCount);


        // Iterating over keys
        for (String key : wordCount.keySet()) {
            System.out.println(key);
        }

// Iterating over values
        for (int value : wordCount.values()) {
            System.out.println(value);
        }

// Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
