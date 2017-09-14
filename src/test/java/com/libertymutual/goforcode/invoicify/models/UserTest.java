package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.springframework.security.core.GrantedAuthority;

public class UserTest {

	private User user;

	@Before
	public void setUp() {
		user = new User();
	}

	@Test
	public void test_all_getters_and_setters() {
		BeanTester tester = new BeanTester();
		tester.testBean(User.class);
	}

	@Test
	public void test_getAuthorities_returns_list_of_strings() {
		List<UserRole> roles = new ArrayList<UserRole>();
		UserRole first = new UserRole("222", new User("FRANK", "GEORGE", "ADMIN"));
		roles.add(first);
		user.setRoles(roles);

		Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

		assertThat(authorities.toString()).isEqualTo("[ROLE_222]");
		assertThat(authorities.size()).isEqualTo(1);
	}

	@Test
	public void test_isAccountNonExpired_returns_true() {
		boolean actual = user.isAccountNonExpired();

		assertThat(actual).isEqualTo(true);
	}

	@Test
	public void test_isAccountNonLocked_returns_true() {
		boolean actual = user.isAccountNonLocked();

		assertThat(actual).isEqualTo(true);
	}

	@Test
	public void test_isCredentialsNonExpired_returns_true() {
		boolean actual = user.isCredentialsNonExpired();

		assertThat(actual).isEqualTo(true);
	}

	@Test
	public void test_isEnabled_returns_true() {
		boolean actual = user.isEnabled();

		assertThat(actual).isEqualTo(true);
	}

}