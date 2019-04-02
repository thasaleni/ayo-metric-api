package com.mmi.ayo.api.services;

import java.util.Optional;

import com.mmi.ayo.api.model.User;

public interface UserAuthenticationService {
	Optional<String> login(String username, String password);

	Optional<User> findByToken(String token);

	void logout(User user);
}
