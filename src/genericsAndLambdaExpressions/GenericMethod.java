package genericsAndLambdaExpressions;

public class GenericMethod {

    public static void main(String[] args) {
     GenericMethod genericMethod = new GenericMethod();
        Integer[] ints = {12, 34, 45, 56};
        genericMethod.printArray(ints);
    }

    public static <T> void printArray(T[] array){
        for(T elements : array){
            System.out.println(elements + " ");
        }
        System.out.println();
    }
}
