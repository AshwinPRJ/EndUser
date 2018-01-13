package com.project.enduser.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enduser.bean.LoginBean;
import com.project.enduser.dao.ILoginDao;
import com.project.enduser.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginDao iLoginDao;

	public LoginBean saveLogin(LoginBean loginBean) {
		
		return iLoginDao.saveLogin(loginBean);
	}
}
