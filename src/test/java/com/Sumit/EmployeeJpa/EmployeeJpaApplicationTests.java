package com.Sumit.EmployeeJpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class EmployeeJpaApplicationTests {

	Employee emp = new Employee();

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		emp.setId(102);
		emp.setName("Raj");
		emp.setAge(23);
		emp.setLocation("Delhi");
	}
	 @Test
	public void testRead(){
		 emp = repository.findById(105).get();
			 System.out.println(emp.getAge());
	 }

	 @Test
	public void testUpdate(){
		 emp.setId(102);
		 emp.setName("divas");
		 emp.setAge(24);
		 emp.setLocation("Delhi");
	 }

	 @Test
	public void testDelete(){
     repository.deleteById(101);
	 }

	 @Test
	public void testCount(){
		 System.out.println("Total Records: "+repository.count());
	 }

     @Test
	public void testFindByName(){
		 List<Employee>  employee  = repository.findByName("Ramesh");
           employee.forEach(p -> System.out.println(p.getAge()));
	 }

	@Test
	public void testFindByAgeRange(){
		List<Employee> employees = repository.findByAgeBetween(22,25);
		employees.forEach(p -> System.out.println(p.getName()));
	}

	@Test
	public void testFindByNameCharacter(){
		List<Employee> a = repository.findByNameLike("A%");
		a.forEach(p -> System.out.println(p.getName()));
	}

//	@Test
//	public void testSorting(){
//		repository.findAll(new Sort("age")).forEach(employee -> System.out.println(employee.getName()));
//	}

	}
