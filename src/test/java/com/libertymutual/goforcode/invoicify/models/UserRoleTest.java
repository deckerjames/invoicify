package com.libertymutual.goforcode.invoicify.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

public class UserRoleTest {

	@Test
	public void test_all_getters_and_setters() {
		BeanTester tester = new BeanTester();
		tester.testBean(UserRole.class);
	}

}
