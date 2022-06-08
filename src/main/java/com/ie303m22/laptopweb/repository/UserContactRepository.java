package com.ie303m22.laptopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ie303m22.laptopweb.models.UserContact;



public interface UserContactRepository extends JpaRepository<UserContact, Long> {

}
