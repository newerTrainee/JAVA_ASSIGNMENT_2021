package com.Sumit.EmployeeJpa;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends /* PagingAndSortingRepository<Employee,Integer>*/ CrudRepository<Employee,Integer>{

    List<Employee> findByName(String name);
    List<Employee> findByAgeBetween(int a,int b);
    List<Employee> findByNameLike(String ch);
}
