package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("identifier")).sendKeys("pasaniarjun@gmail.com",Keys.ENTER);
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("219brjnjsg",Keys.ENTER);
			
	}

}
