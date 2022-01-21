package RestAssured;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Test {

	@Test
	void postairlines() {
	RestAssured.baseURI = "https://api.instantwebtools.net/v1/airlines";
	
	RequestSpecification httpRequest=RestAssured.given();
	JSONObject requestparams= new JSONObject();
	requestparams.put("id","9010680888");
	requestparams.put("name","pranayxcv");
	requestparams.put("country","INDIA");
	requestparams.put("slogan","JAI HIND");
	requestparams.put("headquaters","DELHI");
	requestparams.put("website","airlinedelhi.com");
	requestparams.put("established","1995");
	httpRequest.header("content-Type","application/json");
	httpRequest.body(requestparams.toJSONString());
	Response response=httpRequest.request(Method.POST,"/airlines");
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is" +responseBody);
	int statusCode=response.getStatusCode();	
	System.out.println("Status code is" + statusCode);
	AssertJUnit.assertEquals(statusCode, 201);
}
}

	


	

