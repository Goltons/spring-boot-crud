package com.springbootbankapplication.bank.controller;

import com.springbootbankapplication.bank.entity.Cart;
import com.springbootbankapplication.bank.entity.User;
import com.springbootbankapplication.bank.service.cart.CartServiceImpl;
import com.springbootbankapplication.bank.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        return userService.saveNewUser(user);
    }

}
