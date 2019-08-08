package com.hp.devops.demoapp;

import org.junit.*;

/**
 * check reports in case of failures in BeforeClass
 */
public class BeforeClassTest {

	@BeforeClass
	public static void beforeAll() {
		Assert.assertNotNull("a");
	}

	@Test
	public void BeforeClassTest() {
		Assert.assertNotNull("aaa");
	}

	@Test
	public void beforeClassTest() {
		Assert.assertNotNull("aaa");
	}
}
