import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class ServiceA {
    public void serve() {
        System.out.println("ServiceA is serving...");
    }
}

class ServiceB {
    public void execute() {
        System.out.println("ServiceB is executing...");
    }
}

class Client {
    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void doWork() {
        serviceA.serve();
        serviceB.execute();
    }
}

class DependencyInjector {
    public static void injectDependencies(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(Inject.class)) {
                fields[i].setAccessible(true);
                Object dependency = fields[i].getType().getDeclaredConstructor().newInstance();
                fields[i].set(obj, dependency);
            }
        }
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        DependencyInjector.injectDependencies(client);
        client.doWork();
    }
}
