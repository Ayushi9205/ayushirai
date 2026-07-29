package base;

import static io.restassured.RestAssured.given;

import config.ConfigManager;
import io.restassured.specification.RequestSpecification;

public class Base {

public static RequestSpecification getRequest() 
{
	return given().baseUri(ConfigManager.get("base.uri")).header("Content-type","application/json").header("x-api-key",ConfigManager.get("api.key"));
}
	
}
