package lambdaExpressions.preDefinedInterfaces;

/**
 * Predicate---> one parameter returns boolean
 * Use only if you have conditional checks in your program...
 */


import java.util.ArrayList;
import java.util.function.Predicate;


public class PredicateInterfaceExample {
    public static void main(String[] args) {

// ex:1
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(20));
        System.out.println(p.test(5));
// ex:2
        Predicate<String> s = string -> string.length() > 4;
        System.out.println(s.test("welcome"));
// ex:3
        String names[] = {"David", "Scott", "John", "Mary", "Smith"};
        for (String name : names) {
            if (s.test(name)) {
                System.out.println(name);
            }
        }

// ex:4
        Employee emp = new Employee("John", 50000, 5);

        Predicate<Employee> emps = e -> e.salary > 30000 && e.experience > 3;
        System.out.println(emps.test(emp));

        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee("john", 20000, 5));
        al.add(new Employee("Ammu", 400000, 6));
        al.add(new Employee("Sam", 10000, 3));
        al.add(new Employee("SHubha", 70000, 2));
        al.add(new Employee("Jeevan", 34000, 8));
        al.add(new Employee("Darshan", 90000, 12));

        for (Employee e : al) {
            if (emps.test(e)) {
                System.out.println(e.ename + " " + e.salary);
            }
        }

// ex:5
        int all[] = {5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};

        Predicate<Integer> predicate1 = i -> i % 2 != 0;
        Predicate<Integer> predicate2 = i -> i > 50;

        for(int n : all){
//            predicate1.test(n) && predicate2.test(n)
            if(predicate1.negate().test(n)){
                System.out.println(n);
            }
        }
    }
}

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal, int exp) {
        ename = name;
        salary = sal;
        experience = exp;

    }
}

// Joining the predicated -> amd, or, and negate
