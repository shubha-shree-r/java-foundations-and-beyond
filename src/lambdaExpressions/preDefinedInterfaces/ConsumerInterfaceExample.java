package lambdaExpressions.preDefinedInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
// ex:1
        Consumer<String> consums = s -> System.out.println(s);
        consums.accept("Shubha");
// ex:2
        ArrayList<ConsumerEmployee> arr = new ArrayList<ConsumerEmployee>();
        arr.add(new ConsumerEmployee("Shubha shree", 4000, "female"));
        arr.add(new ConsumerEmployee("Jeevan gowda", 9000000, "male"));
        arr.add(new ConsumerEmployee("Darshan r", 1000000, "male"));
        arr.add(new ConsumerEmployee("Manoghna", 2000000, "female"));
        arr.add(new ConsumerEmployee("Sanjana", 2000000, "female"));

        // Function
        Function<ConsumerEmployee, Integer> fns = emp -> emp.salary * 10 / 100;
        // Predicate
        Predicate<Integer> pre = b -> b >= 5000;
        // Consumer
        Consumer<ConsumerEmployee> consum2 = empData -> {
            System.out.println(empData.ename);
            System.out.println(empData.salary);
            System.out.println(empData.gender);
            System.out.println("-------------");
        };

        for (ConsumerEmployee e : arr) {
            int bonus = fns.apply(e);
            boolean prediction = pre.test(bonus);

            if (prediction) {
                consum2.accept(e);
            }

        }
// ex:3
        Consumer<String> consumer1 = s -> System.out.println(s + " " + "is White");
        Consumer<String> consumer2 = s -> System.out.println(s + " " + "is having four legs");
        Consumer<String> consumer3 = s -> System.out.println(s + " " + "is eating grass");

//        consumer1.accept("Cow");
//        consumer2.accept("Cow");
//        consumer3.accept("Cow");
//        or

//          consumer1.andThen(consumer2).andThen(consumer3).accept("Cow");
//          or

        Consumer<String> consumer4 = consumer1.andThen(consumer2).andThen(consumer3);
        consumer4.accept("Cow");

    }
}

class ConsumerEmployee {
    String ename;
    int salary;
    String gender;

    ConsumerEmployee(String name, int sal, String gen) {
        this.ename = name;
        this.salary = sal;
        this.gender = gen;
    }


}

// Consumer chaining