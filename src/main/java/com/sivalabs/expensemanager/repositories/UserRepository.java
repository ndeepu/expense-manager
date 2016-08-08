package com.sivalabs.expensemanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivalabs.expensemanager.entities.User;

/**
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
