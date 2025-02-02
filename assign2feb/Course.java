
import java.util.*;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: Rs" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 4000);
        c1.displayCourseDetails();
        Course.updateInstituteName("New Tech Academy");
        System.out.println("Updated Institute: " + Course.instituteName);
    }
}

