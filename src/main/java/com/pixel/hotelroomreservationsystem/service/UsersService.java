package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.entity.Users;
import com.pixel.hotelroomreservationsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Optional<Users> user = usersRepository.findByEmail(email);
        if(user.isPresent()){
            var userObj = user.get();
            return User.builder()
                    .username(userObj.getEmail())
                    .password(userObj.getPassword())
                    .roles(getRoles(userObj))
                    .build();
        }else {
        throw new UsernameNotFoundException(email);
    }
    }
    private String[] getRoles(Users users) {
        if(users.getRole()==null){
            return new String[]{"USER"};
        }
        return users.getRole().split(",");
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(Long id){
        return usersRepository.findById(id);
    }

    public void deleteUserById(Long id){
        usersRepository.deleteById(id);

    }

    public void deleteAllUsers(){
        usersRepository.deleteAll();

    }
}
