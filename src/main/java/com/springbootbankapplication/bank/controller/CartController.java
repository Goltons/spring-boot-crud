package com.springbootbankapplication.bank.controller;

import com.springbootbankapplication.bank.entity.Cart;
import com.springbootbankapplication.bank.entity.User;
import com.springbootbankapplication.bank.service.cart.CartServiceImpl;
import com.springbootbankapplication.bank.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartServiceImpl cartService;

    @PostMapping("/save/{id}")
    public ResponseEntity<Cart> save(@RequestBody Cart cart,@PathVariable String id){
        return cartService.saveNewCart(cart,id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Cart>> getByUserId(@PathVariable String id){
        return cartService.getCartsByUserId(id);
    }

}
