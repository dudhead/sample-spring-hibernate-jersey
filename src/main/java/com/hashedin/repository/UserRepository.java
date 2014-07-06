package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.User;

public interface UserRepository {

	User find(Long userId);

	User save(User user);

	List<Task> findTasksByUserId(long userId);

	List<User> findAll();

	User delete(Long userId);
}
