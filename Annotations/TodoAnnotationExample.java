
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement user login", assignedTo = "Alice", priority = "HIGH")
    public void login() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}
}

public class TodoAnnotationExample {
    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(Todo.class)) {
                Todo todo = methods[i].getAnnotation(Todo.class);
                System.out.println(methods[i].getName() + " - Task: " + todo.task() + ", Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}

