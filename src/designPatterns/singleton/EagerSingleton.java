package designPatterns.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Singleton instance created");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
