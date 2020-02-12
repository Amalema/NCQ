package com.ncq.workflow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ncq.workflow.entities.Workflow;
import com.ncq.workflow.entities.WorkflowCategory;
import com.ncq.workflow.repositories.WorkflowCategoryRepository;
import com.ncq.workflow.repositories.WorkflowRepository;

@SpringBootApplication
public class WorkflowApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(WorkflowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	}

}
