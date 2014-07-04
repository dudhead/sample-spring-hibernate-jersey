package com.hashedin.repository;

import com.hashedin.model.User;

public interface UserRepository {

	User find(Long userId);

	User save(User user);
}
