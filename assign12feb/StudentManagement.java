
import java.util.*;
class Student {
    int roll;
    String name, grade;
    int age;
    Student next;

    public Student(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    private Student head;

    void addStudent(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    void deleteStudent(int roll) {
        if (head == null) return;
        if (head.roll == roll) { head = head.next; return; }
        Student temp = head;
        while (temp.next != null && temp.next.roll != roll) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void searchStudent(int roll) {
        for (Student temp = head; temp != null; temp = temp.next)
            if (temp.roll == roll) { 
                System.out.println("Found: " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade); 
                return; 
            }
        System.out.println("Student not found.");
    }

    void updateGrade(int roll, String newGrade) {
        for (Student temp = head; temp != null; temp = temp.next)
            if (temp.roll == roll)
            { temp.grade = newGrade; return; }
    }

    void displayStudents() {
        for (Student temp = head; temp != null; temp = temp.next)
            System.out.println(temp.roll + " | " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        
        list.addStudent(101, "Alice", 20, "A");
        list.addStudent(102, "Bob", 21, "B");
        list.addStudent(103, "Charlie", 22, "C");

        System.out.println("Initial Student Records:");
        list.displayStudents();

        System.out.println("\nSearching for Roll No 102:");
        list.searchStudent(102);

        
        System.out.println("\nUpdating Grade for Roll No 101:");
        list.updateGrade(101, "A+");
        list.displayStudents();

        System.out.println("\nDeleting Roll No 103:");
        list.deleteStudent(103);
        list.displayStudents();
    }
}

