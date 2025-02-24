
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Application {
    @ImportantMethod(level = "HIGH")
    public void start() {
        System.out.println("Application started.");
    }

    @ImportantMethod(level = "MEDIUM")
    public void stop() {
        System.out.println("Application stopped.");
    }
}

public class ImportantMethodExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Application.class.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = methods[i].getAnnotation(ImportantMethod.class);
                System.out.println(methods[i].getName() + " - Level: " + annotation.level());
            }
        }
    }
}

