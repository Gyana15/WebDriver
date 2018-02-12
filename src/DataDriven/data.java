package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class data {
@Test(dataProvider="passData")
@Parameters({"user ID"})
public void data(String userName,String password){
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://wordpress.com/wp-login.php");
	driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(userName);
	driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(password);
}
@DataProvider

public Object[][] passData(){
	Object[][] data=new Object[3][2];
	data[0][0]="admin1";
	data[0][1]="password";

	data[1][0]="admin2";
	data[1][1]="password";
	
	data[2][0]="admin3";
	data[2][1]="password";
	return data;
}
}
