package com.kayvee.helloworld.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTest {
	
	GreetingController greetingController;
	
	@Before
	public void setup(){
		greetingController = new GreetingController();
	}

	@Test
	public void greeting_shouldReturnSuccess() throws Exception {
		String name = "kayvee";
		String expectedGreeting = greetingController.greeting(name);
		assertEquals(expectedGreeting, "Hello "+name);
		
	}
	
	@Test
	public void hello_shouldReturnSuccess() throws Exception {
		String expectedGreeting = greetingController.hello();
		assertEquals(expectedGreeting, "Hello User");
		
	}
}
