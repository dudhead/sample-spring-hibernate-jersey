package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Project;

public interface ProjectRepository {

	Project find(Long projectId);

	List<Project> findAll();

	Project save(Project project);

	Project delete(Long projectId);
}
