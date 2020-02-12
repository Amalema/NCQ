package com.ncq.workflow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncq.workflow.entities.WorkflowCategory;
import com.ncq.workflow.services.WorkflowCategoryService;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/workflowCategories")
public class WorkflowCategoryController {

	@Autowired
	private WorkflowCategoryService workflowCategoryService;

	@ApiOperation(value="Retrieve categories ")
	@GetMapping
	public List<WorkflowCategory> findAll(){
		return workflowCategoryService.findAll();
	}
}
