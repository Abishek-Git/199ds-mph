package com.mph.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mph.hello.Hello;

public class MyTest {
	Hello hel;
	
	@BeforeClass
	public static void setupBeforeclass() {
		System.out.println("before class");
	}
	
	@Before
	public void setup() throws java.lang.Exception {
		hel = new Hello();
		System.out.println("Before called");
	}
	
	@Test
	public void testAdd() {
		assertEquals(30, hel.add(10,5,15));
		System.out.println("test add");
	}
	
	@Test
	public void testMultiply() {
		assertEquals(30, hel.mul(5,2,3));
		System.out.println("mul");

	}
	
	@After
	public void teardown() throws java.lang.Exception {
		hel = null;
		System.out.println("After called");
	}
	
	
	@AfterClass	
	public static void teardownAfterclass() {
		System.out.println("After class");

	}
}
