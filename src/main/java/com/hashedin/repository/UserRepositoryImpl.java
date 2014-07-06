package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Task;
import com.hashedin.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager	em;

	@Override
	public User find(Long userId) {

		return em.find(User.class, userId);
	}

	@Override
	public User save(User user) {

		em.persist(user);
		em.flush();
		return user;
	}

	@Override
	public List<Task> findTasksByUserId(long userId) {

		return em.find(User.class, userId).getTasks();
	}

}
