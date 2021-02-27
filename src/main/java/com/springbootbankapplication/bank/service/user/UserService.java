package com.springbootbankapplication.bank.service.user;

import com.springbootbankapplication.bank.entity.Cart;
import com.springbootbankapplication.bank.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    ResponseEntity<User> saveNewUser(User user);
    void deleteUser(String id);
    ResponseEntity<User> getUserById(String id);
    ResponseEntity<User> updateUser(String id);
}
