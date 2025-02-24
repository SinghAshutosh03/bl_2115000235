
import java.util.*;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

