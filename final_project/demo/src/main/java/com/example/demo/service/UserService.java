package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import extension.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;


    private final BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User save(User user){
        boolean foundEmail = userRepository.existsByEmail(user.getEmail());
        boolean foundUsername = userRepository.existsByUsername((user.getUsername()));
        if(foundEmail || foundUsername ) {
            throw new UserException("Já existe um usuário com este nome");
        }
        user.setPassword(passwordEncoder.encode((user.getPassword())));
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByUsername(String username){
        User user = new User();
        return userRepository.findByUsername(username).orElseThrow(EntityNotFoundException::new);
    }

    public boolean findByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public boolean findByPhoneNum(String phoneNum){
        return userRepository.existsByPhoneNum(phoneNum);
    }

    public Optional<User> findById(UUID id){
        return userRepository.findById(id);
    }

    @Transactional
    public void delete(User user){
        userRepository.delete(user);
    }
}
