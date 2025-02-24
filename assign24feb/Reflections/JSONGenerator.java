import java.lang.reflect.*;
import java.util.*;

class User {
    public String username = "JohnDoe";
    public int age = 25;
}

public class JSONGenerator {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Class<?> cls = user.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            jsonMap.put(fields[i].getName(), fields[i].get(user));
        }

        System.out.println(jsonMap);
    }
}
