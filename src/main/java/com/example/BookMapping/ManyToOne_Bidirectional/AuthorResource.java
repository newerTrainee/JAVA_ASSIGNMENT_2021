package com.example.BookMapping.ManyToOne_Bidirectional;


import com.example.BookMapping.OneToMany_unidirectional.Author2;
import com.example.BookMapping.OneToMany_unidirectional.Author2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorResource {


    @Autowired
    Author1Repository repository;


    @GetMapping("/author/{id}")
    public Author1 retrive(@PathVariable Integer id) {
        System.out.println("");
        Author1 author2 = repository.findById(id).get();
        //System.out.println(author2);
        return author2;
    }

    }
