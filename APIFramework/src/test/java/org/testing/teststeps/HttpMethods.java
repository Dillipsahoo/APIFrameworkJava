package org.testing.teststeps;

import static com.jayway.restassured.RestAssured.given;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HttpMethods {
	Properties pr;
	public HttpMethods(Properties pr) 
	{
		this.pr=pr;
	}
	public Response postRequest(String jsonrequestbody,String uriKey)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(jsonrequestbody)
				.when()
				.post(pr.getProperty(uriKey));
				return res;
	}
	

	public Response getRequest(String uriKey,String idValue)
	{
		String base=pr.getProperty(uriKey);
		String uri=base+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
				return res;
	}

	public Response getAllRequest(String uriKey)
	{
	
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
				return res;
	}
	
	public Response putRequest(String jsonrequestbody,String uriKey,String pathParamter)
	{
		String uri=pr.getProperty(uriKey)+"/"+pathParamter;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(jsonrequestbody)
				.when()
				.put(uri);
				return res;
	}
	
	public Response deleteRequest(String uriKey,String idValue)
	{
		String base=pr.getProperty(uriKey);
		String uri=base+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
				return res;
	}

	
}
