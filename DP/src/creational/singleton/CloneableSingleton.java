package creational.singleton;

public class CloneableSingleton {
    private static CloneableSingleton instance;

    private CloneableSingleton() {
        // Private constructor prevents instantiation by untrusted callers
    }

    // Lazy initialization
    public static synchronized CloneableSingleton getInstance() {
        if (instance == null) {
            instance = new CloneableSingleton();
        }
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
