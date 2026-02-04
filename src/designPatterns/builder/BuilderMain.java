package designPatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user1 = new User.Builder("Alice")
                .age(30)
                .email("test@gmail.com")
                .phone("1234567890")
                .build();
    }
}
