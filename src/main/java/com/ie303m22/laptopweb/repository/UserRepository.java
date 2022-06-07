package com.ie303m22.laptopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ie303m22.laptopweb.models.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
