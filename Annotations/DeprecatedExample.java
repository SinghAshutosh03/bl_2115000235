
class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature - Do not use this method.");
    }

    public void newFeature() {
        System.out.println("New feature - Use this instead.");
    }
}

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}

