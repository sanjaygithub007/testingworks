package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndFill 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		try
		{
		WebElement e=driver.findElement(By.xpath("//*[text()='More options']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",e);
		Thread.sleep(5000);
		js.executeScript("document.getElementByxpath('//*[text()='Create account']).click();");

	//	driver.findElement(By.xpath("//*[text()='Create account']")).click();
	//	WebElement e1=driver.findElement(By.xpath("//*[text()='Create account']"));
	//  js.executeScript("arguments[0].click();",e1);
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.name("FirstName"));
		js.executeScript("arguments[0].value='sanjay';",e2);
		js.executeScript("arguments[0].style.border='2px dotted blue';",e2);
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
	}

}
