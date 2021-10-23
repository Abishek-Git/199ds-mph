package com.mph.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mph.hello.Hello;

@RunWith(Parameterized.class)
public class ParamTest {
	int x;
	int y;
	int result;
	Hello hello;
	
	
	public ParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Before
	public void setup() throws java.lang.Exception {
		hello =  new Hello();
		System.out.println("from before called");
	}
	
	@Parameters
	public static Collection dataresult() {
		return Arrays.asList(new Object[][] {{10,10,20}, {200,199,200}, {1,2,3}});
	}
	@Test
	public void testAdd() {
		assertEquals(result, hello.add(x,y));
	}
}
