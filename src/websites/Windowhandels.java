package websites;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandels {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(3000);
		ArrayList<String> a=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(10000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(a.get(0));
		driver.findElement(By.xpath("//*[@value='Register Here']")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.name("name")).sendKeys("sanjay singh");
		driver.findElement(By.name("dob")).sendKeys("01061991");
		driver.findElement(By.name("email")).sendKeys("pasaniarjun@gmail.com");
		driver.findElement(By.name("cemail")).sendKeys("pasaniarjun@gmail.com");
		
	}
	
	
	

}
