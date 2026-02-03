package designPatterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("Eager Singleton:");
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("Are both eager instances the same? " + (eager1 == eager2));

        System.out.println("\nLazy Singleton:");
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("Are both lazy instances the same? " + (lazy1 == lazy2));

        System.out.println("\nSingleton Class:");
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();
        System.out.println("Are both singleton class instances the same? " + (singleton1 == singleton2));

        AppConfig config1 = AppConfig.INSTANCE;
        AppConfig config2 = AppConfig.INSTANCE;
        System.out.println("\nAppConfig Singleton:");
        System.out.println("Are both AppConfig instances the same? " + (config1 == config2));
        config1.loadConfig();
    }
}
