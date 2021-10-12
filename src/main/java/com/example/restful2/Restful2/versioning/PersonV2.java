package com.example.restful2.Restful2.versioning;

public class PersonV2
{
    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public PersonV2() {
        super();
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}