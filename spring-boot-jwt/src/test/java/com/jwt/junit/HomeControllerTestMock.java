package com.jwt.junit;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.auth.SpringBootHelloWorldApplication;

@RunWith(SpringRunner.class)
@SpringBootConfiguration
@SpringBootTest(classes = SpringBootHelloWorldApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class HomeControllerTestMock extends SpringBootHelloWorldTests{

    @Autowired
    private TestRestTemplate template;
    
    
    
   // @Test
	public void testController() throws Exception {
    	 ResponseEntity<String> response = template.getForEntity("/hello", String.class);
         assertThat(response.getBody()).isEqualTo("Hello World");

	}
}
