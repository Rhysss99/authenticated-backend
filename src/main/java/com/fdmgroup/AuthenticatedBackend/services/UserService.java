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
import com.fdmgroup.AuthenticatedBackend.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       

        
        return userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User is not valid"));
        
    }
    
}
