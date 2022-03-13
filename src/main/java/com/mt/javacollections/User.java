package com.mt.javacollections;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User implements Comparable<User> {

	private String name;
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public int hashCode() {
		//return 1;
		return new HashCodeBuilder(17, 37).append(name).append(email).toHashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		return new EqualsBuilder().append(name, user.name).append(email, user.email).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("name", name)
				.append("email", email)
				.toString();
	}

	@Override
	public int compareTo(User u) {
		return name.compareTo(u.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}