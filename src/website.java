import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.goindigo.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[3]/a")).click();
Thread.sleep(5000L);
try{
Alert al=driver.switchTo().alert();
al.accept();;
}
catch(NoAlertPresentException Ex) {
	System.out.println("not identifying");
}

//System.out.println(al.getText());
//Thread.sleep(5000L);
//al.accept();
	}

}
