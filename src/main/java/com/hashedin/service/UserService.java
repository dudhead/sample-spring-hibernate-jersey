package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.User;

public interface UserService {

	User find(Long userId);

	User save(User user);

	List<Task> findTasksByUserId(long userId);

	List<User> findAll();

	// List<User> findAll();

	// User update(User user, Long userId);

	// User delete(Long userId);
}
