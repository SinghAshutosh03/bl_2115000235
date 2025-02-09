
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("General Person");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Staff working in " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("John", 35, "Math");
        Student s = new Student("snow", 16, 10);
        Staff st = new Staff("sansa", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

