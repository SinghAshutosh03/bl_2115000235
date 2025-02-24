
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Operations {
    @LogExecutionTime
    public void compute() {
        for (int i = 0; i < 1000; i++);
    }
}

public class LogExecutionExample {
    public static void main(String[] args) throws Exception {
        Method method = Operations.class.getMethod("compute");

        long start = System.nanoTime();
        method.invoke(new Operations());
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}

