package com.example.BookMapping.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private  int book_price;
    private  String bookName;

    @ManyToMany(mappedBy = "bookname")
    List<Author3> author;
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


}
