package com.springsecurity.demo.springsecurityoauth2bootcampmaven.repository;

import com.springsecurity.demo.springsecurityoauth2bootcampmaven.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
