public class Main {
    static Employee[] newEmployee;

    public static void main(String[] args) {
        System.out.println("Курсовая 1");
        newEmployee = new Employee[3];
        newEmployee[0] = new Employee("Елена", "Сергеевна", "Петрова", 1, 23500);
        newEmployee[1] = new Employee("Олег", "Владимирович", "Ким", 3, 45000);
        newEmployee[2] = new Employee("Кирилл", "Андреевич", "Коновалов", 2, 23000);
        newEmployee[0].setSalary(50000);
        newEmployee[2].setDep(4);
        System.out.println(" ================================");
        System.out.println("Список всех данных по сотрудникам: ");
        printAllDataByEmployees(newEmployee);
        System.out.println(" ================================");
        System.out.println("Общая сумма затрат на зарплаты в месяц: ");
        System.out.println(countSumSalaryPerMonth(newEmployee) + " руб.");
        System.out.println(" ================================");
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(countMinSalary(newEmployee));
        System.out.println(" ================================");
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(countMaxSalary(newEmployee));
        System.out.println(" ================================");
        System.out.println("Среднее значение зарплат за месяц:");
        System.out.println(countAverageSalaryPerMonth() + " руб.");
        System.out.println(" ================================");
        System.out.println("ФИО всех сотрудников:");
        printEmployeeName(newEmployee);
        System.out.println(" ================================");
    }

    public static void printAllDataByEmployees(Employee[] newEmployee) {
        for (Employee employee : newEmployee) {
            System.out.println(employee);
        }
    }

    public static int countSumSalaryPerMonth(Employee[] newEmployee) {
        int sumSalaryPerMonth = 0;
        for (Employee employee : newEmployee) {
            sumSalaryPerMonth += employee.getSalary();
        }
        return sumSalaryPerMonth;
    }

    public static Employee countMinSalary(Employee[] newEmployee) {
        Employee minSalary = null;
        for (Employee employee : newEmployee) {
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee countMaxSalary(Employee[] newEmployee) {
        Employee maxSalary = null;
        for (Employee employee : newEmployee) {
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public static int countAverageSalaryPerMonth() {
        int averageSalaryPerMonth = countSumSalaryPerMonth(newEmployee);
        averageSalaryPerMonth = averageSalaryPerMonth / newEmployee.length;
        return averageSalaryPerMonth;
    }

    public static void printEmployeeName(Employee[] newEmployee) {
        int count = 0;
        for (Employee employee : newEmployee) {
            count++;
            System.out.println(count + "." + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}
