package services;

import base.Base;
import io.restassured.response.Response;
import models.LoginPayload;


public class LoginService {

	public static Response login() {
		return Base.getRequest().body(LoginPayload.login).when().post("/api/login");
	}
	
}
