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

import com.jayway.restassured.response.Response;

public class TC6_CreateNewEmp {
	static String respIDValue;

	public static void testcase6() throws IOException {
		// TODO Auto-generated method stub
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		String jsonbody=LoadJsonFile.jsonData("../APIFramework/src/test/java/org/testing/resources/employeepayload.json");
	
		HttpMethods http = new HttpMethods(pr);
		Response response=http.postRequest(jsonbody, "EMP_URI");
		System.out.println("-----TestCase 6-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
		respIDValue=ParsingJsonUsingOrgJson.parseJson(response.asString(),"id");
	}

}
