package com.ie303m22.laptopweb.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ie303m22.laptopweb.exception.ResourceNotFoundException;
import com.ie303m22.laptopweb.models.UserCredential;
import com.ie303m22.laptopweb.repository.UserCredentialRepository;
import com.ie303m22.laptopweb.security.UserPrincipal;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserCredentialRepository userCredentialRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserCredential userCredential = userCredentialRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));

		return UserPrincipal.create(userCredential);
	}

	@Transactional
	public UserDetails loadUserById(Long id) {
		UserCredential userCredential = userCredentialRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		return UserPrincipal.create(userCredential);
	}

}
