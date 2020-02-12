package com.ncq.workflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncq.workflow.entities.WorkflowCategory;

public interface WorkflowCategoryRepository extends JpaRepository<WorkflowCategory, Integer> {

}
