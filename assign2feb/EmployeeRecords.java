
import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: Rs" + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void showManagerDetails() {
        System.out.println("Manager - Employee ID: " + employeeID + ", Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 60000);
        emp.display();

        Manager mgr = new Manager(102, "HR", 75000);
        mgr.showManagerDetails();
    }
}

