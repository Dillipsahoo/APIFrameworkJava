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

public class TC1_PostRequest {
	static String respIDValue;
    @ Test
	public void testcase1() throws IOException {
		// TODO Auto-generated method stub
		Properties pr=LoadFile.loadProperties("../APIFramework/URI.properties");
		String jsonbody=LoadJsonFile.jsonData("../APIFramework/src/test/java/org/testing/resources/requestpayload.json");
		Random ran= new Random();
		Integer idvalue = ran.nextInt();
		jsonbody=VaribaleReplacement.ReplaceValue(jsonbody,"id",idvalue.toString());
		String firstname = null;
		//System.out.println("Please enter the user firstname");
		//Scanner sc=new Scanner(System.in);
	//	String firstname=sc.next();
		jsonbody=VaribaleReplacement.ReplaceValue(jsonbody,"Dillip",firstname);
		
		HttpMethods http = new HttpMethods(pr);
		Response response=http.postRequest(jsonbody, "QA_URI");
		System.out.println("-----TestCase 1-------");
		System.out.println("Status Code is  "+response.statusCode());
		System.out.println("Response Data is"+response.asString());
		respIDValue=ParsingJsonUsingOrgJson.parseJson(response.asString(),"id");
	}

}
