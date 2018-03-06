package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cache2 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e,"abdul kalam").build().perform();
		while(2>1)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(3000);
			String x=e.getAttribute("value");
			if(x.equalsIgnoreCase("abdul kalam thoughts"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				break;
			}
		}
		driver.close();
		

	}

}
