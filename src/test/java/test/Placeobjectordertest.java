package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.CreateCollectionResponse;
import services.GET;
import services.POST;

public class Placeobjectordertest {
	
	
	@BeforeMethod
	public void setup() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
	
	@Test
	public void getCollection() {
	Response res = GET.callGet();
	
	Assert.assertEquals(res.getStatusCode(), 200);
	Assert.assertTrue(res.time() < 3000);
	System.out.println(res.asString());

	}
	
	@Test
	public void getObjects() {	
		
		Response res = GET.getObjects();
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertTrue(res.time()<3000);
		System.out.println(res.asString());
	}
	
	@Test
	public void getObjectId() {	
		Response res = GET.getObjectId();
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertTrue(res.time()<3000);
		System.out.println(res.asString());
	}
	
	@Test
	public void createCollection() {
		
		Response res = POST.createCollections();
		
		Assert.assertEquals(res.getStatusCode(), 200, res.asString());
		
		CreateCollectionResponse resbody = res.as(CreateCollectionResponse.class);
		
		Assert.assertNotNull(resbody.getId());
	    System.out.println(resbody.getId());
		Assert.assertEquals(resbody.getName(), "Apple MacBook Pro 17");
		Assert.assertEquals(resbody.getData().get("year"), 2019);
		Assert.assertEquals(resbody.getData().get("price"),1849.99);
		Assert.assertEquals(resbody.getData().get("Hard disk size"), "1 TB");
		Assert.assertEquals(resbody.getData().get("CPU model"),"Intel Core i9");
		Assert.assertTrue(res.time() <3000);
	
}}
