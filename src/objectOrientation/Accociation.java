package objectOrientation;

import java.util.ArrayList;
import java.util.List;

public class Accociation {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");

        StudentName student1 = new StudentName("John Doe", 20);
        StudentName student2 = new StudentName("Jane Smith", 21);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Enrolled StudentName:");
        for (StudentName student : course.getEnrolledStudentName()) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
class StudentName {
    private String name;
    private int age;

    public StudentName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private List<StudentName> enrolledStudentName;

    public Course(String name) {
        this.name = name;
        this.enrolledStudentName = new ArrayList<>();
    }

    public void enrollStudent(StudentName student) {
        enrolledStudentName.add(student);
    }

    public void removeStudent(StudentName student) {
        enrolledStudentName.remove(student);
    }

    public List<StudentName> getEnrolledStudentName() {
        return enrolledStudentName;
    }
}