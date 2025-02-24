
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "NullPointerException occurs on edge cases")
    @BugReport(description = "Memory leak issue when processing large data")
    public void run() {
        System.out.println("Running software...");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("run");
        BugReports bugReports = method.getAnnotation(BugReports.class);

        for (int i = 0; i < bugReports.value().length; i++) {
            System.out.println("Bug: " + bugReports.value()[i].description());
        }
    }
}

