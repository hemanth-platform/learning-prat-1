public class Employee implements Comparable<Employee> {
    private Long id;
    private String name;
    private double salary;
    private String department;

    public Employee(Long id, String name, double salary) {
        this(id, name, salary, null);
    }

    public Employee(Long id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department != null && !department.isEmpty()) {
            return String.format("%s %s (%s): $%.2f",id, name, department, salary);
        }
        return String.format("%s: $%.2f", name, salary);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}