package com.ncq.workflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncq.workflow.entities.WorkflowCategory;
import com.ncq.workflow.repositories.WorkflowCategoryRepository;
@Service
public class WorkflowCategoryService {

	@Autowired
	private WorkflowCategoryRepository workflowCategoryRepository;
	
	public List<WorkflowCategory> findAll(){
		return workflowCategoryRepository.findAll();
	}
}
