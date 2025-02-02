
import java.util.*;

class Circle {
    double radius;

   
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);
        defaultCircle.display();
        customCircle.display();
    }
}

