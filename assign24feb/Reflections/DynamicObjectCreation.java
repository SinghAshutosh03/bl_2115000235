import java.lang.reflect.*;

class Student {
    private String name;

    public Student() {
        this.name = "Default";
    }

    public void show() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getDeclaredConstructor();
        Student student = (Student) constructor.newInstance();

        student.show();
    }
}
