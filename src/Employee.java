import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    // Конструктор
    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Конструктор
    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 1_000.0);
    }

    // Конструктор
    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 25, 1_000.0);
    }

    //get'еры и set'еры
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }
    // Метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}