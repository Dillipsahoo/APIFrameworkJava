package org.testing.utilities;

import java.util.regex.Pattern;

public class VaribaleReplacement
{
	public static String ReplaceValue(String body,String variableName,String variableValue )
	{
	 body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
	 return body;
	}

}
