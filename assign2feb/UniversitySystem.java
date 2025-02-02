
import java.util.*;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void showName() {
        System.out.println("Protected Name: " + name);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", 9.0);
        s1.display();
        
        PostgraduateStudent pg = new PostgraduateStudent(102, "Vhagar", 8.5);
        pg.showName();
    }
}

