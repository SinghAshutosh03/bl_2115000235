
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class ExpensiveOperations {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int num) {
        if (cache.containsKey(num)) {
            return cache.get(num);
        }
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

public class CachingExample {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations obj = new ExpensiveOperations();
        Method method = obj.getClass().getMethod("computeSquare", int.class);

        int number = 5;
        System.out.println("First Call: " + method.invoke(obj, number));
        System.out.println("Second Call (Cached): " + method.invoke(obj, number));
    }
}



