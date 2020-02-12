package com.ncq.workflow;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class WorkflowServiceTest extends WorkflowApplicationTests {
	@Autowired
	private WebApplicationContext webApplicationContext;
	

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testWorkflowFindAll() throws Exception {
		mockMvc.perform(get("/workflow")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("Workflow1")));

	}

	@Test
	public void testWorkflowFindByName() throws Exception {
		mockMvc.perform(get("/workflow/findByName/Workflow3")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("Workflow3")));
	}
	
	@Test
	public void testWorkflowFindByCategories() throws Exception {
		mockMvc.perform(get("/workflow/findByCategories/?ids=1&ids=2")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("Workflow1")));
	}

	@Test
	public void testWorkflowFindByStatus() throws Exception {
		mockMvc.perform(get("/workflow//findByStatus/2")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("Workflow1")));

	}
}
