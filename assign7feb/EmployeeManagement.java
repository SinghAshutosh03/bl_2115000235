
import java.util.*;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String collegeName;

    Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        this.collegeName = collegeName;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + collegeName);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("john", 101, 75000, 5);
        Developer d = new Developer("snow", 102, 60000, "Java");
        Intern i = new Intern("sansa", 103, 20000, "XYZ University");

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}

