import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();

        Method method = cls.getDeclaredMethod("add", int.class, int.class);
        int result = (int) method.invoke(obj, 8, 2);

        System.out.println("Result: " + result);
    }
}
