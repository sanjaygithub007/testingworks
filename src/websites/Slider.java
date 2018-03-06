package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		// Automate Vertical Slider using dragAndDropBy()
		
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/child::*"));
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		a.dragAndDropBy(e1,x1+150,y1).build().perform();
		Thread.sleep(4000);
		a.dragAndDropBy(e1,x1-50,y1).build().perform();
		Thread.sleep(4000);
		
		//Back to Page Level
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		//Automate Horizontal Slider using dragAndDropBy()
		
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/child::*[2]"));
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		Thread.sleep(2000);
		a.dragAndDropBy(e2,x2,y2+300).build().perform();
		Thread.sleep(4000);
		a.dragAndDropBy(e2,x2,y1-490).build().perform();
		
		//Back to Page Level
		driver.switchTo().defaultContent();
		driver.close();
		
		 

	}

}
