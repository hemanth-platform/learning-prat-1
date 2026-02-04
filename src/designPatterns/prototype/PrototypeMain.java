package designPatterns.prototype;

public class PrototypeMain {
    public static void main(String[] args) {

        Employee original = new Employee("Hemanth", "Developer");

        Employee copy1 = original.clone();
        Employee copy2 = original.clone();
        copy1.setName("Bunny");
        copy2.setName("Makala");

        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
    }
}
