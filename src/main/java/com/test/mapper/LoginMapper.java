package com.test.mapper;

import java.util.List;

import com.test.pojo.User;

/**
 * @author liurj
 *
 */
public interface LoginMapper {
/**
 * 登录	
 */
public List<User> findUser(User user);
/**
 * 注册
 */
//public int addUser(User user) ;
//
//}
public boolean addUser(User user);
}
