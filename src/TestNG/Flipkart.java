package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver=null;
	
	@Test
	public void signup() throws IOException{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\Selenium\\WebDriverDemo\\src\\TestNG\\datadriven.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("username"));
	if(prop.getProperty("browser").contains("firefox")){
		driver= new FirefoxDriver();
		driver.get("http://google.com");
	}
	else if(prop.getProperty("browser").contains("chrome")){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		

	}
	else
	{
		driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

	}
}