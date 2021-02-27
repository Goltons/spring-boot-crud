package com.springbootbankapplication.bank.repository;

import com.springbootbankapplication.bank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
