package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC5_DeleteRequest {
	@Test
	public void testcase5() throws IOException {
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response response=http.deleteRequest("QA_URI", TC1_PostRequest.respIDValue);
		System.out.println("-----TestCase 5-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
		
	}
}
