import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String employeeName;
    double employeeAge;
    double employeeSalary;


    public Employee(String employeeName, double employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return -(int) (e1.employeeSalary - e2.employeeSalary);
    }
}

public class Q4 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rahul", 43.2, 8500.8));
        employeeList.add(new Employee("Sumit", 42.5, 8490.8));
        employeeList.add(new Employee("Divas", 41.5, 8450.8));
        employeeList.add(new Employee("Gunjan", 44.1, 8460.8));
        employeeList.add(new Employee("Rubal", 49.1, 8460.8));

        Collections.sort(employeeList, new SalaryComparator());

        for (Employee e : employeeList) {
            System.out.println(e.employeeName + " is " + e.employeeAge + " and earns " + e.employeeSalary);
        }
    }
}