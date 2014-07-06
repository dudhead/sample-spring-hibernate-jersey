package com.hashedin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.repository.ProjectRepository;
import com.hashedin.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository	projectRepository;

	@Override
	public Project find(Long taskId) {

		return projectRepository.find(taskId);
	}

	@Override
	public List<Project> findAll() {

		return projectRepository.findAll();
	}

	@Override
	public Project save(Project project) {

		return projectRepository.save(project);
	}

	@Override
	public List<Task> findTasksByProjectId(Long projectId) {

		return projectRepository.findTasksByProjectId(projectId);
	}

	@Override
	public Project delete(Long projectId) {

		// TODO Auto-generated method stub
		return projectRepository.delete(projectId);
	}

}
