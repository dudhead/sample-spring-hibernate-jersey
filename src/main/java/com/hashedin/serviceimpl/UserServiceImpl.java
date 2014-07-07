package com.hashedin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Task;
import com.hashedin.model.User;
import com.hashedin.repository.UserRepository;
import com.hashedin.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository	userRepository;

	@Override
	public User find(Long userId) {

		return userRepository.find(userId);
	}

	@Transactional
	public User save(User user) {

		userRepository.save(user);
		return user;
	}

	@Override
	public List<Task> findTasksByUserId(long userId) {

		User user = userRepository.find(userId);
		if (user != null)
			return user.getTasks();
		else
			return new User().getTasks();
	}

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User delete(Long userId) {

		return userRepository.delete(userId);
	}

}
