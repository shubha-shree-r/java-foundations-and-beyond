package lambdaExpressions.preDefinedInterfaces;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionPreDefinedInterface {

    public static void main(String[] args) {

// ex:1
        Function<Integer, Integer> function = n -> n * n;

        System.out.println(function.apply(12));

// ex:2
        Function<String, Integer> functionString = str -> str.length();

        System.out.println(functionString.apply("Shubha"));

//  ex:3
        ArrayList<EmployeeDetails> emplys = new ArrayList<EmployeeDetails>();

        emplys.add(new EmployeeDetails("Ramya", 50000));
        emplys.add(new EmployeeDetails("Appu", 30000));
        emplys.add(new EmployeeDetails("Abhi", 20000));
        emplys.add(new EmployeeDetails("Ajay", 40000));
        emplys.add(new EmployeeDetails("Arasu", 60000));

        Function<EmployeeDetails, Integer> fn = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000) {
                return sal * 10 / 100;

            } else if (sal >= 20000 && sal <= 30000) {
                return sal * 20 / 100;
            } else if (sal >= 30000 && sal <= 50000) {
                return sal * 30 / 100;
            } else {
                return sal * 40 / 100;
            }
        };

        for (EmployeeDetails emp : emplys) {
            int bonus = fn.apply(emp);
            System.out.println(emp.ename + " " + emp.salary + " -> " + bonus);
        }

// ex:4

        Function<Integer,Integer> function1 = n-> n*2;
        Function<Integer,Integer> function2 = n-> n*n*n;

        System.out.println(function1.andThen(function2).apply(2));
        System.out.println(function1.compose(function2).apply(2));
    }
}


class EmployeeDetails {

    String ename;
    int salary;

    EmployeeDetails(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}

/**
 * function chaining
 * andThen(), compose()
 */