import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class Hello implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting original = new Hello();
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Greeting.class},
                (obj, method, args1) -> {
                    System.out.println("Logging: " + method.getName());
                    return method.invoke(original, args1);
                });

        proxy.sayHello();
    }
}
