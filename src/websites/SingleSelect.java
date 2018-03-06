package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='More options']")).click();
		driver.findElement(By.xpath("//div[text()='Create account']")).click();
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		a.sendKeys("o",Keys.ENTER).build().perform();
		

	}

}
