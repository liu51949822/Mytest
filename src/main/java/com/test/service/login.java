package com.test.service;



import java.util.List;

import com.test.pojo.User;
public interface login {
	

/**
 * 登录
 */
public List<User> login(User user);


/**
 * 注册
 */
//public int Register(User user);
//}

public  boolean Register(User user);
}
