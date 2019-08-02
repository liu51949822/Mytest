package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.LoginMapper;
import com.test.pojo.User;

@Service
public class LoginService implements login {
	@Autowired
	private LoginMapper loginMapper;

	public List<User> login(User user) {
		// TODO Auto-generated method stub
		List<User> loginSuccess = loginMapper.findUser(user);
			if (loginSuccess.size()!=0) {
				return loginSuccess;
			} return  null;
		
	}

//	public int Register(User user) {
//		// TODO Auto-generated method stub
//      int  a = loginMapper.addUser(user);
//	  return a;
//	}
	public boolean Register(User user) {
		// TODO Auto-generated method stub
	  return  loginMapper.addUser(user);
	}

}
