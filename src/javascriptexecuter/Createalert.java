package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Createalert {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('launching completed');");
	}

}

