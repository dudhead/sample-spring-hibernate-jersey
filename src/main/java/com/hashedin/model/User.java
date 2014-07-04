package com.hashedin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u") })
public class User {

	@Id
	@GeneratedValue
	private Long	id;
	private String	name;
	private String	designation;
	private String	email;
	private String	imageUri;
	@OneToMany(mappedBy = "assignedTo")
	List<Task>		tasks;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDesignation() {

		return designation;
	}

	public void setDesignation(String designation) {

		this.designation = designation;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public String getImageUri() {

		return imageUri;
	}

	public void setImageUri(String imageUri) {

		this.imageUri = imageUri;
	}

	public List<Task> getTasks() {

		return tasks;
	}

	public void setTasks(List<Task> tasks) {

		this.tasks = tasks;
	}

}
