package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3_GetAllRequest {
	@Test
	public void testcase3() throws IOException {
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response response=http.getAllRequest("QA_URI");
		System.out.println("-----TestCase 3-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
		ParsingJsonUsingOrgJson.parseJsonData(response.asString(), "id");
	}
}
