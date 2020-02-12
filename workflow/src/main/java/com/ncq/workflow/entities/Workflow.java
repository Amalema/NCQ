package com.ncq.workflow.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Workflow implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idWorkflow;
	private String name;
	private String description;
	private int enabled;
	@JsonIgnore
	@ManyToMany
	private List<Workflow> workflows;
	@JsonIgnore
	@ManyToMany(mappedBy = "workflows")
	private List<WorkflowCategory> workflowCategories;

	public Integer getIdWorkflow() {
		return idWorkflow;
	}

	public void setIdWorkflow(Integer idWorkflow) {
		this.idWorkflow = idWorkflow;
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

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public List<Workflow> getWorkflows() {
		return workflows;
	}

	public void setWorkflows(List<Workflow> workflows) {
		this.workflows = workflows;
	}

	public List<WorkflowCategory> getWorkflowCategories() {
		return workflowCategories;
	}

	public void setWorkflowCategories(List<WorkflowCategory> workflowCategories) {
		this.workflowCategories = workflowCategories;
	}

}
