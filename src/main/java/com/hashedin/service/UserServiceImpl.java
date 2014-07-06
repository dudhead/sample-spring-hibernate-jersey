package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Task;
import com.hashedin.model.User;
import com.hashedin.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository	UserRepository;

	@Override
	public User find(Long userId) {

		return UserRepository.find(userId);
	}

	@Transactional
	public User save(User user) {

		UserRepository.save(user);
		return user;
	}

	@Override
	public List<Task> findTasksByUserId(long userId) {

		return UserRepository.find(userId).getTasks();
	}

}
