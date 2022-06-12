package com.ie303m22.laptopweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.User;
import com.ie303m22.laptopweb.repository.UserRepository;
import com.ie303m22.laptopweb.security.UserPrincipal;
import com.ie303m22.laptopweb.security.services.UserCredentialService;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserCredentialService userCredentialService; // Tìm email của user đó

	public User getCurrentUser(UserPrincipal userPrincipal) {
		return userCredentialService.getCurrentUserCredential(userPrincipal).getUser();
	}

	public Page<User> findAll(Pageable page) {
		return userRepository.findAll(page);
	}
}
