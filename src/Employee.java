import javax.xml.namespace.QName;
import java.util.Objects;

public class Employee {
    private int id;
    private static int counter = 1;
    private String firstName;
    private String middleName;
    private String lastName;
    private int dep;
    private int salary;


    public Employee(String firstName,String middleName,String lastName, int dep, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dep = dep;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDep() {
        return dep;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ": " + lastName +
                " " + firstName +
                " " + middleName + " /" +
                "отдел - " + dep +
                "/ зарплата - " + salary +
                " руб.";
    }
}
