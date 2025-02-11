package genericsAndLambdaExpressions;

public class GenericClass<T, U> {
    private T first;
    private U second;

    public GenericClass(T first, U second) {
        this.first = first;
        this.second = second;
    }



    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
       GenericClass<Integer,String> generic = new GenericClass<>(2000,"Shubha");
        System.out.println(generic.getFirst());
        System.out.println(generic.getSecond());
    }
}
