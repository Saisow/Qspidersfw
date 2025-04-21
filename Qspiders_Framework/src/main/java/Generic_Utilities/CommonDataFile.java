package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonDataFile {
	
	public String getPropertiesData(String key) throws Throwable {
		
		//Step1:Get the file connection
		FileInputStream fis = new FileInputStream("./src/test/resources/commonprop");
		
		//step2:Load the properties form properties file
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		//step3:Read key value
		
		String value = prop.getProperty(key);
		
		return value;
		
		
		
		
		
	}

}
