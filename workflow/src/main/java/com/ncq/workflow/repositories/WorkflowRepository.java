package com.ncq.workflow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ncq.workflow.entities.Workflow;

public interface WorkflowRepository  extends JpaRepository<Workflow, Integer>{
	
	public List<Workflow> findByName(String name);
	public List<Workflow> findByEnabled(int status);
	@Query("select w from Workflow w inner join w.workflowCategories wc where wc.idWorkflowCategory in :ids")
	List<Workflow> findByCategories(@Param("ids") Integer[] ids);

}
