package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.model.Task;
import com.hashedin.model.User;
import com.hashedin.repository.TaskRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private TaskRepository	taskRepository;

	@Override
	public User find(Long userId) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findTasksByUserId(long userId) {

		// TODO Auto-generated method stub
		return null;
	}

}
