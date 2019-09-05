package creational.singleton;

public class InitializeOnDemandHolderClassIdiom {
    static class SingletonHolder {
        private static InitializeOnDemandHolderClassIdiom instance = new InitializeOnDemandHolderClassIdiom();
    }

    public static InitializeOnDemandHolderClassIdiom getInstance() {
        return SingletonHolder.instance;
    }
}
