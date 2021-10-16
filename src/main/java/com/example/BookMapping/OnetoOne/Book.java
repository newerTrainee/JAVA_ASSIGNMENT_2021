package com.example.BookMapping.OnetoOne;

import com.example.BookMapping.OnetoOne.Author;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @OneToOne
    @JoinColumn(name = "author_id")
    Author author;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;
    private String bookName;



}
