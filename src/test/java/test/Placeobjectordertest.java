package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.CreateCollectionResponse;
import reports.ExtentManager;
import services.CreateObjects;
import services.GetObjects;
import utils.TestListener;

@Listeners(utils.TestListener.class)
public class Placeobjectordertest {
	
	
	@BeforeMethod
	public void setup() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
	
	@Test
	public void getCollection() {
	Response res = GetObjects.callGet();
	
	Assert.assertEquals(res.getStatusCode(), 200);
	Assert.assertTrue(res.time() < 3000);
	System.out.println(res.asString());

	}
	
	@Test
	public void getObjects() {	
		
		Response res = GetObjects.getObjects();
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertTrue(res.time()<3000);
		System.out.println(res.asString());
	}
	
	@Test
	public void getObjectId() {	
		Response res = GetObjects.getObjectId();
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertTrue(res.time()<3000);
		System.out.println(res.asString());
	}
	
	@Test
	public void createCollection() {
		
		Response res = CreateObjects.createCollections();
		
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
	
}

}
