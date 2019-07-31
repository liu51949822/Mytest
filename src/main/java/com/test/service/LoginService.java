package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.LoginMapper;
import com.test.pojo.User;

@Service
public class LoginService implements login {
	@Autowired
	private LoginMapper loginMapper;

	public String login(User user) {
		// TODO Auto-generated method stub
			User loginSuccess = loginMapper.findUser(user);
			if (loginSuccess!=null) {
				return "登录成功";
			} return "登录失败";
		
	}

	public String Register(User user) {
		// TODO Auto-generated method stub
		User registerSuccess = loginMapper.addUser(user);
		return "注册成功";
	}

}
