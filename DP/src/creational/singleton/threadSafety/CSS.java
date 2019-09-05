package creational.singleton.threadSafety;

public final class CSS {
    private static CSS csl;

    private CSS() {

    }

    public static synchronized CSS getInstance() {
        if(csl == null) {
            csl = new CSS();
        }

        return csl;
    }
}
