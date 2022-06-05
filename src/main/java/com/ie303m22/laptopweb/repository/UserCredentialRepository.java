package com.ie303m22.laptopweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, Long> {
	Boolean existsByEmail(String email);

	Optional<UserCredential> findByEmail(String email);
}
