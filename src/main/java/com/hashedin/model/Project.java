package com.hashedin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@XmlRootElement
@Entity
@Table(name = "projects")
@NamedQueries({ @NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p") })
public class Project {

	@Id
	@GeneratedValue
	private Long	id;
	private String	name;
	private String	description;

	@XmlInverseReference(mappedBy = "project")
	@OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
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

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public List<Task> getTasks() {

		return tasks;
	}

	public void setTasks(List<Task> tasks) {

		this.tasks = tasks;
	}

}
