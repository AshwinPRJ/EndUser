package com.project.enduser.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.enduser.bean.LoginBean;
import com.project.enduser.dao.ILoginDao;
@Repository
public class LoginDaoImpl implements ILoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public LoginBean saveLogin(LoginBean loginBean) {
		sessionFactory.getCurrentSession().save(loginBean);
	      return loginBean;
	}

}
