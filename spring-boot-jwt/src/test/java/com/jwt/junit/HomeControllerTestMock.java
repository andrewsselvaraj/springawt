package com.jwt.junit;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
@RunWith(SpringRunner.class)

public class HomeControllerTestMock extends SpringBootHelloWorldTests{

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;
    
    @Test
	public void testEmployee() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));

	}
}
