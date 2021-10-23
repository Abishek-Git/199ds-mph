package com.mph.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mph.hello.User;

public class userTest {
	User user;
	
	@Before
	public void setup() throws java.lang.Exception {
		user = new User();
		System.out.println("before callled");
		
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testUserNameTooShort()
	{
		user.setName("l");
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Username is toooooo shor");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testUserNameTooLong()
	{
		user.setName(null);
		
	}
	
	@After
	public void teardown() throws java.lang.Exception {
		user = null;
		System.out.println("after called");

	}
}
