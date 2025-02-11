package genericsAndLambdaExpressions;

interface Comparable<T> {
    int compareTo(T other);
}

public class GenericInterface implements Comparable<GenericInterface> {
    private String name;
    private int age;

    public GenericInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(GenericInterface other) {
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        GenericInterface person1 = new GenericInterface("Shubha", 26);
        GenericInterface person2 = new GenericInterface("Jeevan", 29);

        int result = person1.compareTo(person2);

        if(result < 0){
            System.out.println(person1.name  + " is younger than " + person2.name);
        }else if(result > 0){
            System.out.println(person1.name  + " is older than " + person2.name);
        }else {
            System.out.println(person1.name + " and " + person2.name + " are of the same age.");
        }
    }
}
