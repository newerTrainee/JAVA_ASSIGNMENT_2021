package com.example.BookMapping.ManyToOne_Bidirectional;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
@Entity
public class Book1 {

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "author_id")
    Author1 author1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;

    private String bookName;

    public Author1 getAuthor1() {
        return author1;
    }

    public void setAuthor1(Author1 author1) {
        this.author1 = author1;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
