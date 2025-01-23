import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry, and Maths:");
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;
        String grade;

        if (percentage >= 80) {
            grade = "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E (Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R (Remedial standards)";
        }

        System.out.println("Percentage: " + percentage + "%, Grade: " + grade);
        
    }
}
