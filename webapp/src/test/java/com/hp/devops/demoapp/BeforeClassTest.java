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
	public void passed1() {
		Assert.assertNotNull("aaa");
	}

	@Test
	public void passed2() {
		Assert.assertNotNull("aaa");
	}

	@Test
	public void failed1() {
		Assert.assertNotNull(null);
	}
}
