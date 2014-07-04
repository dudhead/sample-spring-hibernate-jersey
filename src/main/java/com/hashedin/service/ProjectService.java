package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Project;
import com.hashedin.model.Task;

public interface ProjectService {

	Project find(Long projectId);

	List<Project> findAll();

	Project save(Project project);

	public List<Task> findTasksByProjectId(Long projectId);

	// Project update(Project task, Long taskId);

	// Project delete(Long taskId);
}
