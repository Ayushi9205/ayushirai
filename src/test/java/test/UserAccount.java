package test;
//
//
//import static org.hamcrest.Matchers.lessThan;
//import org.testng.Assert;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import io.restassured.response.Response;
//import reports.ExtentManager;
//import services.LoginService;
//
public class UserAccount {
//	
//	 protected static ExtentReports extent;
//	 protected static ExtentTest test;
//	 
//	  @BeforeSuite
//	    public void beforeSuite() {
//
//	        extent = ExtentManager.getReport();
//	    }
//	
//@Test
//	public void testLogin() {
//	
//	 test = extent.createTest("Login API Test");
//	 
//		Response responselogin = LoginService.login().then().statusCode(200).time(lessThan(2000L)).extract().response();
//		
//		String token = responselogin.jsonPath().getString("token");
//		System.out.println(token);
//		Assert.assertNotNull(token);
//		
//	}
//	
////@Test
////public void testCreateUser() {
////	
////	 test = extent.createTest("Create User API");
////	 
////	Response responsecreateuser = CreateUserService.createUserdata().then().assertThat().statusCode(201).body("name", equalTo("Ayushi")).body("job", equalTo("SDET")).body("createdAt",notNullValue())
////			                       .time(lessThan(2000L)).body(matchesJsonSchemaInClasspath("loginschema.json")).extract().response();
////	
////	String id = responsecreateuser.jsonPath().getString("id");
////	System.out.println(id);
////	System.out.println(responsecreateuser.asString());
////	
////}
//
//	  
////	  @Test
////	  public void testLogin() {
////
////	      test = extent.createTest("Login API Test");
////
////	      test.info("Sending Login Request");
////
////	      Response response = LoginService.login();
////
////	      response.then()
////	              .statusCode(200)
////	              .time(lessThan(2000L));
////
////	      String token = response.jsonPath().getString("token");
////
////	      test.pass("Status Code Verified : 200");
////	      test.pass("Response Time < 2 sec");
////	      test.pass("Token Generated Successfully");
////
////	      test.info("Token : " + token);
////
////	      Assert.assertNotNull(token);
////	  }
////	  
////	  @Test
////	  public void testCreateUser() {
////
////	      test = extent.createTest("Create User API");
////
////	      test.info("Creating New User");
////
////	      Response response = CreateUserService.createUserdata();
////
////	      response.then()
////	              .statusCode(201);
////
////	      test.pass("Status Code Verified");
////
////	      test.info("Response");
////
////	      test.info(response.asPrettyString());
////
////	      Assert.assertEquals(response.jsonPath().getString("name"), "Ayushi");
////
////	      test.pass("User Created Successfully");
////	  }
//	  
//@AfterSuite
//public void afterSuite() {
//
//    extent.flush();
//}
//
//
}
