package services;

import base.Base;
import constants.Endpoints;
import io.restassured.response.Response;

public class GetObjects {
	
	public static Response callGet() {	
		return Base.getRequest().when().get(Endpoints.COLLECTIONS).then().extract().response();	
		}
	
	public static Response getObjectId() {
		return Base.getRequest().pathParam("collectionName","products").pathParam("id","ff8081819f7e10ae019fac9c524240e6").when().get(Endpoints.GETOBJECTID).then().extract().response();	
	}
	
	public static Response getObjects() {
		return Base.getRequest().pathParam("collectionName","products").when().get(Endpoints.GETPRODUCTS).then().extract().response();
		}
	
}
