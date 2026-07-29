package services;

import java.util.HashMap;
import java.util.Map;

import base.Base;
import constants.Endpoints;
import io.restassured.response.Response;
import models.CreateCollectionRequest;

public class CreateObjects {

	public static Response createCollections() {
		
		CreateCollectionRequest request = new CreateCollectionRequest();
		
		Map<String,Object> data = new HashMap<>();
		request.setName("Apple MacBook Pro 17");
		request.setData(data);
		
		data.put("year",2019);
		data.put("price",1849.99);
		data.put("CPU model","Intel Core i9");
		data.put("Hard disk size","1 TB");
		
		return Base.getRequest().pathParam("collectionName","products").body(request).when().post(Endpoints.CREATE).then().extract().response();
		
	}
	
}
