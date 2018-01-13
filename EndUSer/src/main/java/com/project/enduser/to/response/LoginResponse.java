package com.project.enduser.to.response;

import com.project.enduser.bean.LoginBean;
import com.project.enduser.constants.RetailManagementResponse;

public class LoginResponse extends RetailManagementResponse {
	private LoginBean loginBean;

	/**
	 * @return the loginBean
	 */
	public LoginBean getLoginBean() {
		return loginBean;
	}

	/**
	 * @param loginBean
	 *            the loginBean to set
	 */
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

}
