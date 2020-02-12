package com.ncq.workflow.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class WorkflowCategory implements Serializable{
	

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer idWorkflowCategory;
		private String name;
		private String description;
		private String logo;
		private LocalDate createAt;
		private LocalDate updateAt;
		private boolean enabled;
		@ManyToOne
		private WorkflowCategory parentCategory;
		@ManyToMany
		private List<Workflow> workflows;

		public Integer getIdWorkflowCategory() {
			return idWorkflowCategory;
		}

		public void setIdWorkflowCategory(Integer idWorkflowCategory) {
			this.idWorkflowCategory = idWorkflowCategory;
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

		public String getLogo() {
			return logo;
		}

		public void setLogo(String logo) {
			this.logo = logo;
		}

		public LocalDate getCreateAt() {
			return createAt;
		}

		public void setCreateAt(LocalDate createAt) {
			this.createAt = createAt;
		}

		public LocalDate getUpdateAt() {
			return updateAt;
		}

		public void setUpdateAt(LocalDate updateAt) {
			this.updateAt = updateAt;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public WorkflowCategory getParentCategory() {
			return parentCategory;
		}

		public void setParentCategory(WorkflowCategory parentCategory) {
			this.parentCategory = parentCategory;
		}

		public List<Workflow> getWorkflows() {
			return workflows;
		}

		public void setWorkflows(List<Workflow> workflows) {
			this.workflows = workflows;
		}

}
