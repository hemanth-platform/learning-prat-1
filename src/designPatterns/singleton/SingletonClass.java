package designPatterns.singleton;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
        System.out.println("SingletonClass instance created");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
