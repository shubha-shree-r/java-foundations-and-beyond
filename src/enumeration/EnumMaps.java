package enumeration;

import java.util.EnumMap;



public class EnumMaps {

    public enum Sizes{
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        EnumMap<Sizes, Integer> sizes1= new EnumMap<>(Sizes.class);
        sizes1.put(Sizes.SMALL, 28);
        sizes1.put(Sizes.MEDIUM, 32);
        sizes1.put(Sizes.LARGE,40);

        System.out.println("EnumMap1:"+ sizes1);

        EnumMap<Sizes, Integer> sizes2 = new EnumMap<>(Sizes.class);
        sizes2.putAll(sizes1);
        sizes2.put(Sizes.LARGE, 42);

        System.out.println("EnumMap2:" + sizes2);

        System.out.println("Size of EnumMap:"+ sizes1.size());

        System.out.println("Key/Value mappings: " + sizes1.entrySet());


        System.out.println("Keys: " + sizes1.keySet());


        System.out.println("Values: " + sizes1.values());
    }
}
