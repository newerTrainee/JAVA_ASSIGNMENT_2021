package com.example.BookMapping;

import com.example.BookMapping.ManyToOne_Bidirectional.Author1;
import com.example.BookMapping.ManyToOne_Bidirectional.Author1Repository;
import com.example.BookMapping.ManyToOne_Bidirectional.Book1;
import com.example.BookMapping.OneToMany_unidirectional.Author2Repo;
import com.example.BookMapping.OnetoOne.Author;
import com.example.BookMapping.OnetoOne.AuthorRepository;
import com.example.BookMapping.OnetoOne.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
//@RestController
class BookMappingApplicationTests {

	@Autowired
	AuthorRepository repository;
	@Autowired
	Author1Repository repositories;
	@Autowired
	Author2Repo repo;

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


//	@Test
//	public  void testUnidirectional(){
//		Author2 author2 = new Author2();
//		Book2 book2 = new Book2();
//		book2.setBook_price(200);
//		book2.setBookName("Devil");
//		Book2 book21 = new Book2();
//		book21.setBook_price(300);
//		book21.setBookName("FaryTale");
//		HashSet<Book2> books = new HashSet<>();
//		books.add(book2);
//		books.add(book21);
//		author2.setBookName(books);
//repo.save(author2);
	}
