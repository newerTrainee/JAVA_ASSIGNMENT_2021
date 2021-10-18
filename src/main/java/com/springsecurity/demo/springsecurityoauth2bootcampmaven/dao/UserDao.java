package com.springsecurity.demo.springsecurityoauth2bootcampmaven.dao;


import com.springsecurity.demo.springsecurityoauth2bootcampmaven.domain.AppUser;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.domain.GrantAuthorityImpl;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.domain.User;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;


    public AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if (username != null) {
            return new AppUser(user.getUsername(), user.getPassword(), Arrays.asList(new GrantAuthorityImpl(user.getRole())));
        } else {
            throw new RuntimeException();
        }

    }

}
