package sampletcrepo1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericutility_Library.PropertiesUtility;
import genericutility_Library.propertiesutility1;

public class sampletc {
	public static void main(String[] args) {
		PropertiesUtility PUTIL=new PropertiesUtility();
		String URL=PUTIL.getDataFromPropertiesString ("url");
		String USERNAME=PUTIL.getDataFromPropertiesString("username");
		String PASSWORD=PUTIL.getDataFromPropertiesString("password");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium folder\\kcsm22credentials.properties");
		WebDriver driver=new ChromeDriver();
		
}}