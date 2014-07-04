package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Project;

public interface ProjectService {

	Project find(Long projectId);

	List<Project> findAll();

	Project save(Project project);

	// Project update(Project task, Long taskId);

	// Project delete(Long taskId);
}