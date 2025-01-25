
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int employeeCount = 10;
        double[] salaries = new double[employeeCount];
        int[] yearsOfService = new int[employeeCount];
        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

           
            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = input.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                } else {
                    break;
                }
            }

           
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                } else {
                    break;
                }
            }

           
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

       
        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salaries[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonuses[i]);
            System.out.println("New Salary: " + newSalaries[i]);
            System.out.println();
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

       
    }
}

