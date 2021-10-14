package com.example.Jpql.JpqlDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpqlDemoApplicationTests {
		@Autowired
		EmployeeRepo employeeRepo;

	@Test
	void contextLoads() {
	}
	@Test
	public void testCreate(){
		Employee obj = new Employee();
		obj.setFirstName("Sumit");
		obj.setLastName("Chouchan");
		obj.setAge(23);
		obj.setSalary(10000);

		employeeRepo.save(obj);

	}


}
