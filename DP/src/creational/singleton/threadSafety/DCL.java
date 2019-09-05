package creational.singleton.threadSafety;

public class DCL {
    // volatile is here because without it by the time second thread passes instance == null,
    // first thread might not construct new Singleton() yet:
    // no one promises that creation of the object happens-before assignment to instance for any thread but the one actually creating the object.
    // volatile in turn establishes happens-before relation between reads and writes, and fixes the broken pattern.
    private static volatile DCL instance;

    private DCL() {
        // Private constructor prevents instantiation by untrusted callers
    }

    // Double-checked locking
    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
