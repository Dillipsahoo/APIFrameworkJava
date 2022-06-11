package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;



public class TC2_GetRequest {
	@Test
	public void testcase2() throws IOException {
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response response=http.getRequest("QA_URI", TC1_PostRequest.respIDValue);
		System.out.println("-----TestCase 2-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
	//	ResponseValidate.statusCodeValidate(response,200);
	//	ResponseValidate.DataValidate(response, "Dillip", ".firstname");
	}

}
