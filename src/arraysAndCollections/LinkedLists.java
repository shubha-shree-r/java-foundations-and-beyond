package arraysAndCollections;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<String> links = new LinkedList<>();
        links.add("Apple");
        links.addFirst("Banana");
        links.addLast("Orange");

        System.out.println(links);
        System.out.println(links.get(2));
        System.out.println(links.getFirst());
        System.out.println(links.remove(1));
        System.out.println(links);
        System.out.println(links.add("Apple"));
        System.out.println(links);

        System.out.println("   ");
        for (int i = 0; i < links.size(); i++) {
            String fruit = links.get(i);
            System.out.println(fruit);
        }
    }
}
