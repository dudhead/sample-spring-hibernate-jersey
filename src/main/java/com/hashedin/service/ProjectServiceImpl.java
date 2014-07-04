package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.repository.TaskRepository;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private TaskRepository	taskRepository;

	@Override
	public Project find(Long taskId) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findAll() {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project save(Project task) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findTasksByProjectId(Long projectId) {

		// TODO Auto-generated method stub
		return null;
	}

}
