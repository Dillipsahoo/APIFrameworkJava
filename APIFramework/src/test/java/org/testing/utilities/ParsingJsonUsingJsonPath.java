package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
	
	public static String parsejsonPath(Response res,String jsonPath) 
	{
		return res.jsonPath().get(jsonPath);
		
	}

}
