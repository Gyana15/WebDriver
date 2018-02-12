import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
		
		//String path=System.getProperty("user.dir");
		//System.out.println(path);
//My name dont edit
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
//WebDriver cd= new ChromeDriver();
//cd.navigate().to("http:google.com");
System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "//IEDriverServer_x64_2.53.1//IEDriverServer.exe");
//cd.get("http:yahoo.com");

InternetExplorerDriver ID= new InternetExplorerDriver ();
ID.get("http://gmail.com");
WebElement we=ID.findElement(By.id("Email"));
	}

}
