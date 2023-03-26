public class Main {
    static Employee[] newEmployee;

    public static void main(String[] args) {
        System.out.println("Курсовая 1");
        // double percent = 12;
        newEmployee = new Employee[10];
        newEmployee[0] = new Employee("Елена", "Сергеевна", "Петрова", 1, 23500);
        newEmployee[1] = new Employee("Олег", "Владимирович", "Ким", 2, 45000);
        newEmployee[2] = new Employee("Кирилл", "Андреевич", "Коновалов", 3, 23000);
        newEmployee[3] = new Employee("Анна", "Владимировна", "Сергеева", 4, 65000);
        newEmployee[4] = new Employee("Сергей", "Александрович", "Шегай", 5, 60000);
        newEmployee[5] = new Employee("Антон", "Глебович", "Каримов", 1, 30000);
        newEmployee[6] = new Employee("Владимир", "Андреевич", "Васин", 2, 24000);
        newEmployee[7] = new Employee("Алла", "Антоновна", "Карташова", 3, 70000);
        newEmployee[8] = new Employee("Максим", "Александрович", "Сумин", 4, 55000);
        newEmployee[9] = new Employee("Илья", "Сергеевич", "Сидоров", 5, 26000);
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
