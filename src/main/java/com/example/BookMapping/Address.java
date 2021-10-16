package com.example.BookMapping;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    private  String streetNumber;
    private String location;
    private String State;

}
