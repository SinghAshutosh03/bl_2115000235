import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.util.ArrayList"; // Example class
        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\nMethods:");
        Method[] methods = cls.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println("\nFields:");
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
    }
}
