/**
 * 
 */
package com.gyl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gyl.model.User;

/**
 * @Decription
 * @author gyl  Email:1076030424@qq.com
 * @version 1.0
 * @date 2020年2月7日下午8:35:41
 *
 */
@Component("userDao")
public class UserDaoimpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<User> getList() {
		String hql = "from User";
		Session currentSession = sessionFactory.getCurrentSession();
		Query<User> createQuery = currentSession.createQuery(hql);
		return createQuery.list();
	}

}
