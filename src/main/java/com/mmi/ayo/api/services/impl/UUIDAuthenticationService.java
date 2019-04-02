package com.mmi.ayo.api.services.impl;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mmi.ayo.api.model.User;
import com.mmi.ayo.api.services.UserAuthenticationService;
import com.mmi.ayo.api.services.UserCrudService;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class UUIDAuthenticationService implements UserAuthenticationService {

	@NonNull
	UserCrudService users;

	@Override
	public Optional<String> login(final String username, final String password) {
		final String uuid = UUID.randomUUID().toString();
		final User user = new User(username,password, uuid);

		users.save(user);
		return Optional.of(uuid);
	}

	@Override
	public Optional<User> findByToken(final String token) {
		return users.find(token);
	}

	@Override
	public void logout(final User user) {

	}
}
