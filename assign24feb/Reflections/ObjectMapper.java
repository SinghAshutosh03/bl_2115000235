import java.lang.reflect.*;
import java.util.*;

class Person {
    public String name;
    public int age;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (String key : properties.keySet()) {
            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, properties.get(key));
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 30);

        Person person = toObject(Person.class, data);
        System.out.println(person.name + " - " + person.age);
    }
}
