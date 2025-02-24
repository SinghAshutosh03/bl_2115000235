
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}

public class RoleBasedAccessExample {
    public static void main(String[] args) throws Exception {
        String userRole = "USER"; // Change to "ADMIN" to allow access

        Method method = SecureService.class.getMethod("adminTask");
        RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

        if (roleAllowed != null && roleAllowed.value().equals(userRole)) {
            method.invoke(new SecureService());
        } else {
            System.out.println("Access Denied!");
        }
    }
}

