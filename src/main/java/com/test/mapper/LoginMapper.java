package com.test.mapper;

import com.test.pojo.User;

/**
 * @author liurj
 *
 */
public interface LoginMapper {
/**
 * 登录	
 */
public User findUser(User user);
/**
 * 注册
 */
public User addUser(User user);

}
