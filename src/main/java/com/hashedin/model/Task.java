package com.hashedin.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "tasks")
@NamedQueries({ @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t") })
public class Task {

	@Id
	@GeneratedValue
	private Long	id;
	private String	title;
	private String	description;
	private int		status;
	private int		priority;
	private Date	createdAt;
	private Date	dueDate;

	@ManyToOne
	private Project	project;

	@ManyToOne
	private User	assignedTo;

	public Long getId() {

		return id;
	}

	public String getTitle() {

		return title;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public int getStatus() {

		return status;
	}

	public void setStatus(int status) {

		this.status = status;
	}

	public int getPriority() {

		return priority;
	}

	public void setPriority(int priority) {

		this.priority = priority;
	}

	public Date getCreatedAt() {

		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {

		this.createdAt = createdAt;
	}

	public Date getDueDate() {

		return dueDate;
	}

	public void setDueDate(Date dueDate) {

		this.dueDate = dueDate;
	}

	public Project getProject() {

		return project;
	}

	public void setProject(Project project) {

		this.project = project;
	}

	public User getAssignedTo() {

		return assignedTo;
	}

	public void setAssignedTo(User assignedTo) {

		this.assignedTo = assignedTo;
	}

}
