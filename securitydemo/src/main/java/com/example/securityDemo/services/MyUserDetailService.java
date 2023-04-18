package com.example.securityDemo.services;

import com.example.securityDemo.entities.MyUserDetails;
import com.example.securityDemo.entities.Users;
import com.example.securityDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
  @Autowired
   private UserRepository userRepository;



   public MyUserDetailService(UserRepository userRepository){
       this.userRepository = userRepository;


   }
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Users> user = userRepository.findByUserName(userName);
        user.orElseThrow(()->new UsernameNotFoundException("Not Found"+ userName));
         return user.map(MyUserDetails::new).get();
    }
}
