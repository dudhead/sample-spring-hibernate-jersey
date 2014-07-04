package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Project;
import com.hashedin.model.Task;

@Repository("projectRepository")
public class ProjectRepositoryImpl implements ProjectRepository {

	@PersistenceContext
	private EntityManager	em;

	@Override
	public Project find(Long projectId) {

		return em.find(Project.class, projectId);
	}

	@Override
	public List<Project> findAll() {

		TypedQuery<Project> query = em.createNamedQuery("Project.findAll",
				Project.class);
		List<Project> results = query.getResultList();
		return results;
	}

	@Override
	public Project save(Project project) {

		em.persist(project);
		em.flush();
		return project;
	}

	@Override
	public List<Task> findTasksByProjectId(Long projectId) {

		return em.find(Project.class, projectId).getTasks();
	}

}
