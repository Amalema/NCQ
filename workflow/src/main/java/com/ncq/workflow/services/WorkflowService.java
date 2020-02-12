package com.ncq.workflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.repositories.WorkflowRepository;

@Service
public class WorkflowService {

	@Autowired
	private WorkflowRepository workflowRepository;

	public List<Workflow> findAll() {
		return workflowRepository.findAll();
	}

	public List<Workflow> findByName(String name) {
		return workflowRepository.findByName(name);
	}

	public List<Workflow> findByCategories(Integer[] ids) {
		return workflowRepository.findByCategories(ids);
	}
	
	public List<Workflow> findByStatus(int status)  {
		if(status>0 && status <6) {
		return workflowRepository.findByEnabled(status);
		}else {
			try {
				throw new Exception("le sqwsdfgh");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
