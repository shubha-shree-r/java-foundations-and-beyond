package arraysAndCollectionsFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(90);

        System.out.println("Highest score: " + scores.last());
        System.out.println("Lowest score: " + scores.first());


        System.out.println("Scores between 80 and 95: " + scores.subSet(80, 95));

        System.out.println(" ");

        Iterator<Integer> iter = scores.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
