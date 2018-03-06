package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("(//*[contains(@class,'fluid dropdown')])[1]"));
		a.click(e1).build().perform();
		Thread.sleep(3000);
		a.sendKeys("P").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		a.sendKeys("a").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		

	}

}
