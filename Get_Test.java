package RestAssured;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Test {
@Test
	void getairlines() {
	RestAssured.baseURI = "https://api.instantwebtools.net/v1/airlines";
	
	RequestSpecification httpRequest=RestAssured.given();
	
	Response response=httpRequest.request(Method.GET,"1233218798");
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is" +responseBody);
	int statusCode=response.getStatusCode();	
	System.out.println("Status code is" + statusCode);
	AssertJUnit.assertEquals(statusCode,200);
}
}
