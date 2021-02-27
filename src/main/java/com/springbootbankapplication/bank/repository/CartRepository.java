package com.springbootbankapplication.bank.repository;

import com.springbootbankapplication.bank.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,String> {
    List<Cart> findAllByUserUserId(String userId);
}
