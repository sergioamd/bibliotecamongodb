package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =  DemoApplication.class)
@TestPropertySource(locations = "classpath:application.properties")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
