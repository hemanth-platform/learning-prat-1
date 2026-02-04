package designPatterns.builder;

public class User {

    private final String name;
    private final int age;
    private final String email;
    private final String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + email + " | " + phone;
    }

    // 2️⃣ Builder
    public static class Builder {
        private String name;        // required
        private int age;            // optional
        private String email;       // optional
        private String phone;       // optional

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}