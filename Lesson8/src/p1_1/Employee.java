package p1_1;

public class Employee extends Person {
    public Employee(String name) {
        super(name);

    }

    @Override
    public void info() {
        System.out.println("Employee");
    }

    public void info(String name) {
        System.out.println("Employee " + name);
    }

    public void info(String name, int age) {
        System.out.println("Employee " + name + "Age " + age);
    }
}
