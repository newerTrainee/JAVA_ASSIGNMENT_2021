package com.example.Restful_Web_Service.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends  RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
