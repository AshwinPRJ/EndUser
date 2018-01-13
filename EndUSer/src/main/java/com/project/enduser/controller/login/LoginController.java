package com.project.enduser.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.enduser.bean.LoginBean;
import com.project.enduser.constants.RetailManagementConstants;
import com.project.enduser.service.ILoginService;
import com.project.enduser.to.response.LoginResponse;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILoginService iLoginService;

	@PostMapping(value = "/loginSave")
	public LoginResponse saveLogin(@RequestBody LoginBean loginBean) {
		
		LoginBean response = iLoginService.saveLogin(loginBean);
		LoginResponse loginResponse = new LoginResponse() ;
		if(response == null) {
			loginResponse.setResponseCode(RetailManagementConstants.NO_CONTENT);
			loginResponse.setResponseMessage("No Data Found");
			return loginResponse;
		}
		loginResponse.setResponseCode(RetailManagementConstants.CREATED);
		loginResponse.setResponseMessage("success");
		loginResponse.setStatusType("success");
		//loginResponse.setLoginBean(loginBean);
		return loginResponse;
	}
}
