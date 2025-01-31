import java.util.*;

class Employee {
    private String[] name;
    private int[] id;
    private int[] salary;

    public Employee(String[] name, int[] id, int[] salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        for (int i = 0; i < id.length; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("ID: " + id[i]);
            System.out.println("Salary: " + salary[i]);
            System.out.println("----------------------");
        }
    }
}

public class EmployeeRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id = new int[3];
        int[] salary = new int[3];
        String[] name = new String[3];

        for (int i = 0; i < id.length; i++) {
            System.out.println("Enter name:");
            name[i] = sc.nextLine();
            System.out.println("Enter ID:");
            id[i] = sc.nextInt();
            System.out.println("Enter salary:");
            salary[i] = sc.nextInt();
            sc.nextLine(); 
        }

        Employee e1 = new Employee(name, id, salary);
        e1.display();
    }
}

