package com.test.pojo;

public class User {
	private Integer uId;
	private String uName;
	private String uPassword;

	public User(User user) {
		this.uId = user.uId;
		this.uName = user.uName;
		this.uPassword = user.uPassword;
		System.out.println(user.toString());
	}

	public User() {

	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + "]";
	}

	
}
