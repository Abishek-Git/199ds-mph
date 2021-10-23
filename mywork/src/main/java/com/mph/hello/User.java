package com.mph.hello;

public class User {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setName("abi");
		System.out.println(user.getName());
		
	}

}
