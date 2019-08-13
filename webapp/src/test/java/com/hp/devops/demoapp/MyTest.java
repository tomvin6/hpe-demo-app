package com.hp.devops.demoapp;

import org.junit.*;

/**
 * check reports in case of failures in BeforeClass
 */
public class MyTest {

	@BeforeClass
	public static void beforeAll() {
		Assert.assertNotNull(null);
//		String str = null;
//		System.out.println(str.length());
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



