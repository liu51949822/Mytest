package com.test.pojo;

public class User {
	private Integer uId;
	private String uNmae;
	private String uPassword;

	public User(User user) {
		this.uId = user.uId;
		this.uNmae = user.uNmae;
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

	public String getuNmae() {
		return uNmae;
	}

	public void setuNmae(String uNmae) {
		this.uNmae = uNmae;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uNmae=" + uNmae + ", uPassword=" + uPassword + "]";
	}

}
