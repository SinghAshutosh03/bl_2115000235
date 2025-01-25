
import java.util.Scanner;

class GradeFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[][] marks = new int[numStudents][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentage = new double[numStudents];
        char[] grades = new char[numStudents];
        int[] gradeFrequency = new int[6]; // Index: 0-A, 1-B, 2-C, 3-D, 4-E, 5-R
        char[] gradeLetters = {'A', 'B', 'C', 'D', 'E', 'R'};
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " Marks: ");
                marks[i][j] = input.nextInt();
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 80) {
                grades[i] = 'A';
                gradeFrequency[0]++;
            } else if (percentage[i] >= 70) {
                grades[i] = 'B';
                gradeFrequency[1]++;
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
                gradeFrequency[2]++;
            } else if (percentage[i] >= 50) {
                grades[i] = 'D';
                gradeFrequency[3]++;
            } else if (percentage[i] >= 40) {
                grades[i] = 'E';
                gradeFrequency[4]++;
            } else {
                grades[i] = 'R';
                gradeFrequency[5]++;
            }
        }
        System.out.println("\nStudent Report:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2] + ", Percentage=" + percentage[i] + "%, Grade=" + grades[i]);
        }
        System.out.println("\nGrade Frequency:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Grade " + gradeLetters[i] + ": " + gradeFrequency[i] + " students");
        }

        input.close();
    }
}

