package com.springbootbankapplication.bank.service.cart;

import com.springbootbankapplication.bank.entity.Cart;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartService {

     ResponseEntity<Cart> saveNewCart(Cart cart,String id);
     void deleteCart(String cartId);
     ResponseEntity<List<Cart>> getCartsByUserId(String userId);
     ResponseEntity<Cart> updateCart(String cartId);

}
