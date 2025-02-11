package arraysAndCollections;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("apple");
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
    }
}
