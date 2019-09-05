package creational.singleton.nonCompliant;

public class CS {
    private static CS cs = new CS();

    private CS() {

    }

    public static CS getInstance() {
        return cs;
    }
}
