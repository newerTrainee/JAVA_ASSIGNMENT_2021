package com.example.BookMapping.OnetoOne;

import com.example.BookMapping.Address;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Author {

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    Book bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;

    @Embedded
    Address address;



}
