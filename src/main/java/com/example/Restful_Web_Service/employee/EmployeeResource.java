package com.example.Restful_Web_Service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService service;


    //Retrieve ALL Employees
    @GetMapping("/employees")
    public List<Employee> getAllEmp() {
        return service.findAll();
    }

    //Get Employee
    @GetMapping("/employees/{id}")
    public Employee getEmp(@PathVariable Integer id) {
        Employee employee = service.findOne(id);
       if(employee == null) {
           try {
               throw new EmployeeNotFoundException("id-"+id);
           } catch (EmployeeNotFoundException e) {
               e.printStackTrace();
           }
       }
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmp(@PathVariable Integer id) {
        Employee employee = service.deleteOne(id);
        if(employee == null) {
            try {
                throw new EmployeeNotFoundException("id-" + id);
            } catch (EmployeeNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    @PostMapping("/employees")
    public ResponseEntity<Object> createEmp(@RequestBody Employee employee) {
        Employee savedEmployee = service.save(employee);
       URI location = ServletUriComponentsBuilder.fromCurrentRequest()
               .path("/{id}")
               .buildAndExpand(savedEmployee.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}