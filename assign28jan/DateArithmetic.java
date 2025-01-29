import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a date in YYYY-MM-DD format:");
        String inputDate = sc.nextLine();
        
        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate);
        
        // Add 7 days, 1 month, and 2 years
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks
        result = result.minusWeeks(3);
        
        System.out.println("Resulting date after adding and subtracting: " + result);
        
        sc.close();
    }
}
