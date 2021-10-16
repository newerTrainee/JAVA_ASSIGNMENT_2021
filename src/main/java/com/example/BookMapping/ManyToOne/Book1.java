package com.example.BookMapping.ManyToOne;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class Book1 {

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author1 author1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;

    private String bookName;
}
