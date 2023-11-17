package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FetchDataFromproperties {

	private static final char[] URL = null;

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream
				("C:\\Selenium folder\\kcsm22credentials.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
				

	}

}
