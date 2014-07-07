package com.hashedin.serviceimpl;

import java.util.ArrayList;
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
	public Project find(Long projectId) {

		return projectRepository.find(projectId);
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

		Project project = projectRepository.find(projectId);
		if (project != null) {
			return project.getTasks();
		}
		else {
			return new Project().getTasks();
		}
	}

	@Override
	public Project delete(Long projectId) {

		// TODO Auto-generated method stub
		return projectRepository.delete(projectId);
	}

	@Override
	public List<Task> findTasksOfProjectByStatus(Long projectId, Long status) {

		Project project = projectRepository.find(projectId);
		List<Task> tasks = new ArrayList<Task>();
		for (Task task : project.getTasks()) {
			if (task.getStatus() == status) {
				tasks.add(task);
			}
		}
		return tasks;
	}
}
