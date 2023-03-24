import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    static Employee [] employee;

    public void main(String[] args) {
        System.out.println("Курсовая 1");
        employee = new Employee[3];
        employee[0] = new Employee( "FBV", 1, 23500);
        employee[1] = new Employee( "DFG", 3, 45000);
        employee[2] = new Employee( "GFH", 2, 23000);
       // for (Employee i : employee) {
       //     System.out.println("i = " + i);
        System.out.println(Arrays.toString(Employee));
        }

}