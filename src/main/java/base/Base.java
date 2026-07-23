package base;

import static io.restassured.RestAssured.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import models.LoginPayload;
import reports.ExtentManager;
import services.LoginService;

public class Base {

	 public static final String BASEURI = "https://reqres.in";
	 public static final String APIKEY = "free_user_3GuC8rqQ4hlGV79voWjIyt1Feew";

	  
	
	 public static RequestSpecification getRequest() {
		 RestAssured.baseURI = BASEURI;
return given().header("x-api-key",APIKEY).header("Content-Type","application/json");	

	 }
	 
	
}
