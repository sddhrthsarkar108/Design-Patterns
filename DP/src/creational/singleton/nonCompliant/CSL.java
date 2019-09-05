package creational.singleton.nonCompliant;

public final class CSL {
    private static CSL csl;

    private CSL() {

    }

    public static CSL getInstance() {
        if(csl == null) {
            csl = new CSL();
        }

        return csl;
    }
}
