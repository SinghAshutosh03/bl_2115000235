
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;

    public User(String username) {
        if (username.length() > 5) {
            throw new IllegalArgumentException("Username exceeds max length!");
        }
        this.username = username;
    }
}

public class MaxLengthExample {
    public static void main(String[] args) {
        User user = new User("John");
        System.out.println("Username: " + user.username);
    }
}

