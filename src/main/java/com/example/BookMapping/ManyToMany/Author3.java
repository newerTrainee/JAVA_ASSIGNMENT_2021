package com.example.BookMapping.ManyToMany;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Author3 {

    @ManyToMany( cascade = CascadeType.ALL)
            @JoinTable(name = "author_book",
                    joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "author_id"),
                    inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "book_id"))
    Set<Book3> bookname;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;

    public Set<Book3> getBookname() {
        return bookname;
    }

    public void setBookname(Set<Book3> bookname) {
        this.bookname = bookname;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

}
