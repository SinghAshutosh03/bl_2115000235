import java.lang.reflect.*;

class Task {
    public void runTask() {
        for (int i = 0; i < 1000; i++);
    }
}

public class ExecutionTiming {
    public static void main(String[] args) throws Exception {
        Task obj = new Task();
        Method method = obj.getClass().getDeclaredMethod("runTask");

        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
