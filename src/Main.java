import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Alice", 75000, "Engineering"));
        employees.add(new Employee(2L,"Bob", 50000, "Marketing"));
        employees.add(new Employee(3L,"Charlie", 120000, "Management"));
        employees.add(new Employee(4L,"Diana", 95000, "Engineering"));
        employees.add(new Employee(5L,"Eve", 60000, "Marketing"));
        employees.add(new Employee(6L, "Frank", 45000, "Engineering"));


        // Print all employees
        //System.out.println("Employees:");
        //employees.forEach(e -> System.out.println("  " + e));

        // Sort by salary ascending
        //Collections.sort(employees);
        //System.out.println("\nEmployees sorted by salary (ascending):");
        //employees.forEach(e -> System.out.println("  " + e));

        // Highest paid employee
        //Employee highest = employees.get(employees.size() - 1);
        //System.out.println("\nHighest paid: " + highest);

        // Average salary (compute once and reuse)
        double avg = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        //System.out.printf("Average salary of employees: $%.2f\n", avg);

        // Collect names of employees who earn more than the average
        /*List<String> aboveAvgNames = employees.stream()
                .filter(e -> e.getSalary() > avg)
                .map(Employee::getName)
                .collect(java.util.stream.Collectors.toList());*/

        //System.out.println("Employees earning more than the average:");
       /* if (aboveAvgNames.isEmpty()) {
            System.out.println("  (none)");
        } else {
            aboveAvgNames.forEach(n -> System.out.println("  " + n));
        }*/

       /* List<Employee> empLst = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((dept, emps) -> {

            System.out.printf("Average salary in %s: $%.2f\n", dept, deptAvg);
        });*/

        /* 001 Code to print the list of employees whose salary is grater than the average salary*/
        double avgSalary = employees.stream().mapToDouble(emp -> emp.getSalary()).average().orElse(0.0);
        //System.out.printf("Overall average salary: $%.2f\n", avgSalary);

        List<Employee> empList = employees.stream().filter(emp -> emp.getSalary() > avgSalary).toList();
        //System.out.println("The list of employees :\n" + empList.toString());

        /* 002 Code to get the map of employee id and name*/
        Map<Long ,String> empMap = employees.stream().collect(Collectors.toMap(x -> x.getId(),x-> x.getName()));
        empMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));


    }

}