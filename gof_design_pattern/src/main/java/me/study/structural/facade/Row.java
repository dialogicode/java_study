package me.study.structural.facade;

public class Row {
	private final String name;
	private final String birthday;
	private final String email;

	public Row(String name, String birthday, String email) {
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getEmail() {
		return email;
	}
}
