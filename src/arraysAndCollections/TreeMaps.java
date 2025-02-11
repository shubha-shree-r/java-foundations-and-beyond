package arraysAndCollections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 2);
        wordCount.put("orange", 5);
        wordCount.put("apple", 4);


        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
             String key = entry.getKey();
             int value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println( wordCount.headMap("banana") );
        System.out.println(wordCount.tailMap("banana"));
        System.out.println( wordCount.subMap("apple", "orange"));
    }
}
