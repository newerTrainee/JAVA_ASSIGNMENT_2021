package com.example.Restful_Web_Service.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int empCount = 3;

    static {
        employees.add(new Employee(100, "sumit", 22));
        employees.add(new Employee(101, "divas", 23));
        employees.add(new Employee(102, "pratik", 23));
    }

    public List<Employee> findAll() {  //To get Whole List
        return employees;
    }

    public Employee save(Employee employee) {
        if (employee.getId() ==null) employee.setId(++empCount);
        employees.add(employee);
        return employee;
    }

    public Employee findOne(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
            {
                return employee;
            }
        }
    return null;
    }


    public  Employee deleteOne(Integer id){
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()){
            Employee employee = it.next();
            if(employee.getId() == id){
                it.remove();
                return employee;
            }
        }
        return null;
    }
}
