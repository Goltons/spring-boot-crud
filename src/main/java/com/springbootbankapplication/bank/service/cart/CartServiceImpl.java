package com.springbootbankapplication.bank.service.cart;

import com.springbootbankapplication.bank.entity.Cart;
import com.springbootbankapplication.bank.entity.User;
import com.springbootbankapplication.bank.repository.CartRepository;
import com.springbootbankapplication.bank.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    private final CartRepository cartRepository;
    private final UserRepository userRepository;


    @Override
    public ResponseEntity<Cart> saveNewCart(Cart cart,String id) {
        User user=userRepository.findById(id).orElseThrow(RuntimeException::new);
        cart.setUser(user);
        return ResponseEntity.ok(cartRepository.save(cart));
    }

    @Override
    public void deleteCart(String cartId) {
        cartRepository.findById(cartId).orElseThrow(IllegalArgumentException::new);
        cartRepository.deleteById(cartId);
    }

    @Override
    public ResponseEntity<List<Cart>> getCartsByUserId(String userId) {
        userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
        return ResponseEntity.ok(cartRepository.findAllByUserUserId(userId));
    }

    @Override
    public ResponseEntity<Cart> updateCart(String cartId) {
        return null;
    }
}
