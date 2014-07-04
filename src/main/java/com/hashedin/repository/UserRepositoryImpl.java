package com.hashedin.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hashedin.model.User;
import com.hashedin.service.UserService;

@Repository("userRepository")
public class UserRepositoryImpl implements UserService {

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

}
