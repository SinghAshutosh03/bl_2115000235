
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

public class JsonSerializationExample {
    public static void main(String[] args) throws Exception {
        User user = new User("Alice", 30);
        Class<?> cls = user.getClass();
        Field[] fields = cls.getDeclaredFields();
        Map<String, Object> jsonMap = new HashMap<>();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].isAnnotationPresent(JsonField.class)) {
                JsonField annotation = fields[i].getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), fields[i].get(user));
            }
        }

        System.out.println(jsonMap);
    }
}

