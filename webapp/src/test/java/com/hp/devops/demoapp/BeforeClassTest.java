package com.hp.devops.demoapp;

import org.junit.*;

/**
 * check reports in case of failures in BeforeClass
 */
public class BeforeClassTest {
    int counter = 0;

	@BeforeClass
	public static void beforeAll() {
		Assert.assertNotNull("a");
	}

	@Before
	public void beforeEach() {
	    if (counter == 0) {
            Assert.assertNotNull("a");
        }
		counter++;
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
