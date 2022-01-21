package RestAssured;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class airline_01 {
	@Test
	public void postAirline()
	{
		String url= "https://api.instantwebtools.net/v1/airlines";
	String requestBody = "{\r\n"
				+ "    \"id\": \"1233218798\",\r\n"
				+ "    \"name\": \"pranay\",\r\n"
//				+ "    \"country\": \"INDIA\",\r\n"
//				+ "    \"slogan\": \"from India\",\r\n"
//				+ "    \"head_quaters\": \"Delhi,INDIA\",\r\n"
//				+ "    \"website\": \"www.pranayINDIA.com\",\r\n"
//				+"    \"established\": \"2005\",\r\n"
				+"}";
		Map<String, String> expectedHeaders = new HashMap<String, String>();
		expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		expectedHeaders.put("Server", "nginx/1.18.0");

		given().log().all().header("Content-Type", "application/json")
		.and().body(requestBody)
		.when().post(url)
		.then().log().all().statusCode(200)
		.and().statusLine("HTTP/1.1 200 OK")
		.and().headers(expectedHeaders);
	     
}
	
	@Test(description = "Get Request for all user")
	public static void getairlines()
	{

		
		
//		given()
//		.when().get("https://api.instantwebtools.net/v1/airlines/:1233218798")
//		.then()
//		.statusCode(200);
//		//.body("id", equalTo("1233218798"))
//		//.body("name", equalTo("pranay") );
//		
//	}
		String url = "https://api.instantwebtools.net/v1/airlines/1233218798";
	//	String requestBody = "{\r\n"
		//	+ "    \"id\": \"1233218798\",\r\n"
			//+ "    \"name\": \"pranay\",\r\n"
		//	+"}";
		Map<String, String> expectedHeaders = new HashMap<String, String>();
		expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		expectedHeaders.put("Server", "nginx/1.18.0");

		given().log().all()
		.when().get(url)
		.then().log().all().assertThat().statusCode(200)
		//.and().statusLine("HTTP/1.1 200 OK")
		.and().headers(expectedHeaders);
	}
	
	
	public void createPassenger()
{
	String url= "https://api.instantwebtools.net/v1/passenger";
	
	  String requestBody = "{\r\n" 
	  + "    \"name\": \"rahul\",\r\n" 
	  + "    \"trips\": \"500\",\r\n" 
	  + "    \"airline\": \"1233218798\"\r\n"
	  + "}";
	 
	
		/*
		 * Map<String, String> expectedHeaders = new HashMap<String, String>();
		 * expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		 * expectedHeaders.put("Server", "nginx/1.18.0");
		 */

	given().log().all().header("Content-Type", "application/json")
	.and().body(requestBody)
	.when().post(url)
	.then().log().all().assertThat().statusCode(200);
	//.and().statusLine("HTTP/1.1 200 OK")
	//.and().headers(expectedHeaders);
}	

	@Test
	public static void PatchPassenger()
	{
		String url="https://api.instantwebtools.net/v1/passenger/61e81ce1413a271bfc4de835";
		
		String requestBody="{\r\n" 
				  + "    \"name\": \"roy\"\r\n" 
				  + "}";
	
		Map<String, String> expectedHeaders = new HashMap<String, String>();
		expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		expectedHeaders.put("Server", "nginx/1.18.0");
	
	given().log().all().header("Content-Type", "application/json")
	.and().body(requestBody)
	.when().patch(url)
	.then().log().all().assertThat().statusCode(200)
	.and().headers(expectedHeaders);

}

	@Test
	public void PutPassenger()
	{
		String url="https://api.instantwebtools.net/v1/passenger/61ea7c1d2406818278d51fd9";
		
		String requestBody="{\r\n"
				+ "		\"name\":\"yup\",\r\n"
				+ "		\"trips\":\"307\",\r\n"
				+ "		\"airline\":\"7\"\r\n"
				+ "}";
		
		
		  Map<String, String> expectedHeaders = new HashMap<String, String>();
		  expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		  expectedHeaders.put("Server", "nginx/1.18.0");
		 
		
		
		given().log().all().header("Content-Type", "application/json")
		.and().body(requestBody)
		.when().put(url)
		.then().log().all().assertThat().statusCode(200)
		.and().headers(expectedHeaders);
	}	
	
	@Test
	public void DeletePassenger()
	{
String url = "https://api.instantwebtools.net/v1/passenger/61ea79bef43a2d4dc6cbfb06"; 
		 
		 
		 
		
		Map<String, String> expectedHeaders = new HashMap<String, String>();
		expectedHeaders.put("Content-Type", "application/json; charset=utf-8");
		expectedHeaders.put("Server", "nginx/1.18.0");
		//expectedHeaders.put("Content-Encoding", "gzip");

		given().log().all()
		.when().delete(url)
		.then().log().all().assertThat().statusCode(200)
		//.and().statusLine("HTTP/1.1 200 OK")
		.and().headers(expectedHeaders);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



























































