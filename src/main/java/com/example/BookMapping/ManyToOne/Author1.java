package com.example.BookMapping.ManyToOne;
import com.example.BookMapping.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Author1 {
    @OneToMany(mappedBy = "author1",cascade = CascadeType.ALL)
    Set<Book1> bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;

    @Embedded
    Address address;


    public void addBookName(Book1 book1){
        if(book1 != null){
            if(bookName == null){
                bookName = new HashSet<>();
            }
            book1.setAuthor1(this);
            bookName.add(book1);
        }
    }

}
