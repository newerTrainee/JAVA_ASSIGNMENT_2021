package com.example.BookMapping.ManyToOne_Bidirectional;
import com.example.BookMapping.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Author1 {
    @JsonBackReference
    @OneToMany(mappedBy = "author1",cascade = CascadeType.ALL)
    Set<Book1> bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;

    @Embedded
    Address address;


    public void addBookName(Book1 book1) {
        if (book1 != null) {
            if (bookName == null) {
                bookName = new HashSet<>();
            }
            book1.setAuthor1(this);
            bookName.add(book1);
        }
    }

    public Set<Book1> getBookName() {
        return bookName;
    }

    public void setBookName(Set<Book1> bookName) {
        this.bookName = bookName;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
