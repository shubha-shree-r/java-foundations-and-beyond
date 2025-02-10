package enumeration;
import java.util.*;
import java.util.EnumSet;

public class EnumSets {

    public enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        EnumSet<Days> set1 = EnumSet.allOf(Days.class);
        System.out.println(set1);

        EnumSet<Days> set2 = EnumSet.noneOf(Days.class);
        System.out.println(set2);

        EnumSet<Days> set3 = EnumSet.of(Days.FRIDAY,Days.SATURDAY);
        System.out.println(set3);

        EnumSet<Days> set4 = EnumSet.of(Days.MONDAY,Days.TUESDAY);
        Iterator<Days> iter = set4.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
