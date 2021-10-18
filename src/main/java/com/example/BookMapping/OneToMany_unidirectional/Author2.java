package com.example.BookMapping.OneToMany_unidirectional;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author2 {

@OneToMany(cascade = CascadeType.PERSIST)
        @JoinColumn(name = "author_id" ,referencedColumnName = "author_id" )
    Set<Book2> bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;

    public Set<Book2> getBookName() {
        return bookName;
    }

    public void setBookName(Set<Book2> bookName) {
        this.bookName = bookName;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

}
