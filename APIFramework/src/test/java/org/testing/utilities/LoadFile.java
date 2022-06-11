package org.testing.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

//Here load the properties file



public class LoadFile 
{
   public static Properties loadProperties(String filePath) throws IOException
   {
	  File f = new File(filePath);
	  FileReader fr = new FileReader(f);
	  Properties pr = new Properties();
	  pr.load(fr);;
	  return pr;
   }
}
