package com.example.restful2.Restful2.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController
{
    @GetMapping("v1/person")
    public PersonV1 personV1()
    {
        return new PersonV1("Sumit Chauhan");
    }


    //URI Versioning
    @GetMapping("v2/person")
    public PersonV2 personV2()
    {
        return new PersonV2(new Name("Sumit","Chauhan"));
    }

    //Request Parameter Versioning
    @GetMapping(value="/person/param",params="version=1")
    public PersonV1 paramV1()
    {
        return new PersonV1("Sumit Chauhan");
    }

    @GetMapping(value = "/person/param",params = "version=2")
    public PersonV2 paramV2()
    {
        return new PersonV2(new Name("Sumit", "Chauhan"));
    }

    //Custom Header Versioning
    @GetMapping(value="/person/header",headers = "X-API-VERSION=1")
    public PersonV1 headerV1()
    {
        return new PersonV1("Sumit Chauhan");
    }

    @GetMapping(value = "/person/header",headers = "X-API-VERSION=2")
    public PersonV2 headerV2()
    {
        return new PersonV2(new Name("Sumit", "Chauhan"));
    }

    //Mimetype / Content Negotiation / Accept Versioning
    @GetMapping(value="/person/mime",produces = "application/company.app-v1+json")
    public PersonV1 mimetypeV1()
    {
        return new PersonV1("Sumit chauhan");
    }

    @GetMapping(value = "/person/mime",produces = "application/company.app-v2+json")
    public PersonV2 mimetypeV2()
    {
        return new PersonV2(new Name("Sumit", "Chauhan"));
    }

}
