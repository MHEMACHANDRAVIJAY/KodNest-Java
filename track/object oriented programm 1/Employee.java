public class Employee {
    private String name;
    private int id;
    private int age;
    private int salary;
    private String designation;

    Employee(String name, int id, int age, int salary, String designation) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    void work() {
        System.out.println(name + " is working.");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Anu", 11, 25, 45000, "Software Developer");
        employee.displayDetails();
        employee.work();
    }
}
