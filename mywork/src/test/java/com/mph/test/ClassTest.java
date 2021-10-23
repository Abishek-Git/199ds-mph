package com.mph.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClassTest {
	
	@Test
	public void testCase1() {
		String str1 = new String("Abisheak");
		String str2 = new String("Abishek");
		

		assertNotEquals(str1, str2);
		
	}
	@Test
	public void testCase2() {
		String str1 = new String("Abishek");
		String str2 = new String("Abishek");
		assertEquals(str1, str2);
	}
	@Test
	public void testCase3() {
		String[] arr1 = {"abi", "iba", "eng"};
		String[] arr2 = {"abi", "iba", "eng"};
		
		assertArrayEquals(arr1, arr2);
	}
	@Test
	public void testCase4() {
		int a = 2;
		int b = 3;
		
		assertTrue(a<b);
		
	}
	

}
