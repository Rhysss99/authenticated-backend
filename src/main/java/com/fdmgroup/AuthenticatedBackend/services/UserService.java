package com.fdmgroup.AuthenticatedBackend.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fdmgroup.AuthenticatedBackend.model.ApplicationUser;
import com.fdmgroup.AuthenticatedBackend.model.Role;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the user details service");

        if(!username.equals("Ethan")) throw new UsernameNotFoundException("Not ethan");
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1, "USER"));

        
        return new ApplicationUser(1, "Ethan", encoder.encode("password"), roles);
    }
    
}