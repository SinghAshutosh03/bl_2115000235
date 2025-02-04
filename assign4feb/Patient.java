
import java.util.Scanner;

class Patient {
    private static String hospitalName = "General Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

 
    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

   
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }


    public void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Ailment: ");
        String ailment = sc.nextLine();


        Patient patient = new Patient(name, id, age, ailment);
        patient.displayPatient();
        getTotalPatients();
    }
}

