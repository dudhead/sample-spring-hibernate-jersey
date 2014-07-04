package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Project;

public interface ProjectService {

	Project find(Long taskId);

	List<Project> findAll();

	Project save(Project task);

	// Project update(Project task, Long taskId);

	// Project delete(Long taskId);
}
