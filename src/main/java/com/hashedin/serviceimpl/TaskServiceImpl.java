package com.hashedin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Task;
import com.hashedin.repository.TaskRepository;
import com.hashedin.service.TaskService;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository	taskRepository;

	@Override
	public Task find(Long taskId) {

		// Returns the Task for given taskId.
		return taskRepository.find(taskId);
	}

	@Transactional
	public Task save(Task task) {

		// Saves the given task object and returns the same.
		taskRepository.save(task);
		return task;
	}

	@Override
	public List<Task> findAll() {

		// Returns all the tasks in our system.
		return taskRepository.findAll();
	}

	@Override
	public Task update(Task task, Long taskId) {

		// Updates the task with the given taskId;
		return null;
	}

	@Transactional
	public Task delete(Long taskId) {

		// Deletes the task with the give taskId and returns the same.
		return taskRepository.delete(taskId);
	}

	@Override
	public List<Task> findByStatus(int status) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> getStatistics() {

		// TODO Auto-generated method stub
		return null;
	}

}
