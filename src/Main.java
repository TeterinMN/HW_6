public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Михаил", "Тетерин", 43, 150000.0);
        Employee employee2 = new Employee("Тимофей", "Тетерин", 14);

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("Are they equal? " + employee1.equals(employee2));
    }
}
