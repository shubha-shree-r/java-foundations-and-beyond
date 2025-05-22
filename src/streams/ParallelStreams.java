package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ParallelStreams {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
                new Student("David", 82),
                new Student("Bob", 86),
                new Student("Petter", 90),
                new Student("John", 87),
                new Student("Ross", 76),
                new Student("Smith", 50),
                new Student("Scott", 55)
        );
//using stream
        student.stream().filter(n -> n.getScore() >= 80).limit(3).forEach(n -> System.out.println(n.getName() + " " + n.getScore()));

//using parallel stream
        student.parallelStream().filter(n -> n.getScore() >= 80).limit(3).forEach(n -> System.out.println(n.getName() + " " + n.getScore()));
    }
}
