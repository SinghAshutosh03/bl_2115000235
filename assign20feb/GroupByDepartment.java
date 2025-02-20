
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedByDepartment = new HashMap<>();

        for (Employee employee : employees) {
            groupedByDepartment
                    .computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
                    .add(employee);
        }

        return groupedByDepartment;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }
}

