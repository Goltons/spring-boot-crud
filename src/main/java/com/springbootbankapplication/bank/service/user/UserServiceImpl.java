package com.springbootbankapplication.bank.service.user;

import com.springbootbankapplication.bank.entity.Cart;
import com.springbootbankapplication.bank.entity.User;
import com.springbootbankapplication.bank.repository.CartRepository;
import com.springbootbankapplication.bank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final CartRepository cartRepository;
    private final UserRepository userRepository;


    @Override
    public ResponseEntity<User> saveNewUser(User user) {

        List<Cart> carts=new ArrayList<>();
        user.getCarts().forEach(item->{
            Cart cart =new Cart();
            cart=item;
            cart.setUser(user);
            carts.add(cart);
        });
        cartRepository.saveAll(carts);
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<User> getUserById(String id) {

        return ResponseEntity.ok(userRepository.findById(id).orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public ResponseEntity<User> updateUser(String id) {
        return null;
    }
}
