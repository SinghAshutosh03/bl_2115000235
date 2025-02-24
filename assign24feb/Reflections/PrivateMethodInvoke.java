import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Class<?> cls = calc.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(calc, 5, 10);
        System.out.println("Multiplication Result: " + result);
    }
}
