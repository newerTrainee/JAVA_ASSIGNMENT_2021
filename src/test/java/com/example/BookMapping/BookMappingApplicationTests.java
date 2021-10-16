package com.example.BookMapping;

import com.example.BookMapping.ManyToOne.Author1;
import com.example.BookMapping.ManyToOne.Author1Repository;
import com.example.BookMapping.ManyToOne.Book1;
import com.example.BookMapping.OnetoOne.Author;
import com.example.BookMapping.OnetoOne.AuthorRepository;
import com.example.BookMapping.OnetoOne.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class BookMappingApplicationTests {

	@Autowired
	AuthorRepository repository;
	@Autowired
	Author1Repository repositories;

	@Test
	void contextLoads() {
	}


	@Test
	public void testCreateEntries(){
		Author author = new Author();
		Address address = new Address();
		address.setStreetNumber("F-100/1");
		address.setLocation("Agra");
		address.setState("UP");
		author.setAddress(address);
		Book book = new Book();
		book.setBookName("IAmDevil");
		author.setBookName(book);
		repository.save(author);
	}

	@Test
	public void testOneTomanyInsert(){
		Author1 author1 = new Author1();
		Address address = new Address();
		address.setStreetNumber("F-100/1");
		address.setLocation("Agra");
		address.setState("UP");
		author1.setAddress(address);
		Book1 book1 = new Book1();
		book1.setBookName("Devil");
		Book1 book2 = new Book1();
		book2.setBookName("BadMen");
	   author1.addBookName(book1);
	   author1.addBookName(book2);
	   repositories.save(author1);
	}
}
