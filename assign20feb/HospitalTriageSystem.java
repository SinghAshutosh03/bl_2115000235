
import java.util.*;

public class HospitalTriageSystem {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Order of treatment:");

        int queueNumber = 1;
        while (!pq.isEmpty()) {
            Patient patient = pq.remove();
            System.out.printf("Queue %d: %s (Severity: %d)\n", queueNumber++, patient.name, patient.severity);
        }
    }
}

