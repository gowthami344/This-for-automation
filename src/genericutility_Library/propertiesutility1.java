package genericutility_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class propertiesutility1 {
	
public String getDataFromProperties(String data) throws Exception {
	FileInputStream fis=new FileInputStream
			("C:\\Selenium folder\\kcsm22credentials.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(data);
	return value;
	
			
	
	}
	

}
