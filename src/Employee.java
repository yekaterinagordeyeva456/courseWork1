import java.util.Objects;

public class Employee {
    private Counter idEmployee;
    private String name;
    private int department;
    private int salary;



    public Employee(String name,int department,int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        idEmployee = new Counter();
            }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

}
