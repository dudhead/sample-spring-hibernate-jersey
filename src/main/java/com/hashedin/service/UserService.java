package com.hashedin.service;

import com.hashedin.model.User;

public interface UserService {

	User find(Long userId);

	User save(User user);

	// List<User> findAll();

	// User update(User user, Long userId);

	// User delete(Long userId);
}
