//package com.mmi.ayo.api.services.impl;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.mmi.ayo.api.model.User;
//import com.mmi.ayo.api.repositories.UserRepository;
//import com.mmi.ayo.api.services.UserCrudService;
//@Service
//public class DatabaseUserService implements UserCrudService {
//    @Autowired
//    private UserRepository userRepository;
//	@Override
//	public User save(User user) {
//		return userRepository.save(user);
//	}
//
//	@Override
//	public Optional<User> find(String id) {
//		return userRepository.findById(id);
//	}
//
//	@Override
//	public Optional<User> findByUsername(String username) {
//		return userRepository.findByUsername(username);
//	}
//
//}
