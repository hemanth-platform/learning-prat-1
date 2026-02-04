package designPatterns.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Prototype {

    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public Employee clone() {
        return new Employee(this.name, this.role);
    }

    @Override
    public String toString() {
        return name + " - " + role;
    }


}
