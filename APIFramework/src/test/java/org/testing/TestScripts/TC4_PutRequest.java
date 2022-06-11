package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.teststeps.HttpMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.VaribaleReplacement;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4_PutRequest {
	@Test
	public void testcase4() throws IOException {
		// TODO Auto-generated method stub
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		String jsonbody=LoadJsonFile.jsonData("../APIFramework/src/test/java/org/testing/resources/updaterequestpayload.json");
	
		HttpMethods http = new HttpMethods(pr);
		Response response=http.putRequest(jsonbody, "QA_URI",TC1_PostRequest.respIDValue);
		System.out.println("-----TestCase 4-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
	}


}
