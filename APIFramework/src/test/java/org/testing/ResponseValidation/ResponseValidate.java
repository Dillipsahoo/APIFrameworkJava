package org.testing.ResponseValidation;

import org.testing.utilities.ParsingJsonUsingJsonPath;
import org.testing.utilities.ParsingJsonUsingOrgJson;

import com.jayway.restassured.response.Response;

public class ResponseValidate {
	
	public static void DataValidate(Response res,String expectedData,String jsonPathh)
	{
		String actualData=ParsingJsonUsingJsonPath.parsejsonPath(res,jsonPathh);
	  if(expectedData.equals(actualData))
	  {
		  System.out.println("Data is matching");
	  }
	  else
	  {
		  System.out.println("Data is not matching");
	  }
	}
	
	public static void statusCodeValidate(Response res,int expectedStatusCode)
	{
		int actualStatusCode=res.statusCode();
		if(actualStatusCode==expectedStatusCode)
		{
			System.out.println("Status Code is matching");
		}
		else
		{
			System.out.println("Status Code is not matching");
		}
	}


}
