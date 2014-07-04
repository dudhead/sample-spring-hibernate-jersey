package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Task;

public interface TaskService {

	Task find(Long taskId);

	List<Task> findAll();

	List<Task> findByProjectId(long projectId);

	List<Task> findByAssignedTo(long userId);

	List<Task> findByStatus(int status);

	Task save(Task task);

	Task update(Task task, Long taskId);

	Task delete(Long taskId);
}
