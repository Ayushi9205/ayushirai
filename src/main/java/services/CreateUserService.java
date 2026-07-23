package services;

import base.Base;
import io.restassured.response.Response;
import models.CreateUserPayload;


public class CreateUserService {

	public static Response createUserdata() {
		return Base.getRequest().body(CreateUserPayload.createUser).when().post("/api/users");
	}
}
