package com.ie303m22.laptopweb.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.UserCredential;
import com.ie303m22.laptopweb.repository.UserCredentialRepository;
import com.ie303m22.laptopweb.security.UserPrincipal;

@Service
public class UserCredentialService {
	@Autowired
	UserCredentialRepository userCredentialRepository;

	public UserCredential getCurrentUserCredential(UserPrincipal userPrincipal) {
		String email = userPrincipal.getEmail();

		UserCredential userCredential = userCredentialRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));

		return userCredential;
	}
}
