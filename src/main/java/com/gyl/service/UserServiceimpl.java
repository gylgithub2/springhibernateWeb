/**
 * 
 */
package com.gyl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyl.dao.UserDao;
import com.gyl.model.User;

/**
 * @Decription
 * @author gyl  Email:1076030424@qq.com
 * @version 1.0
 * @date 2020年2月7日下午8:36:51
 *
 */
@Service("userService")
public class UserServiceimpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getList() {
		return userDao.getList();
	}
}
