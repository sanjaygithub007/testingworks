package datadrivenframework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapGmail 
{
	public static void main(String[] args) throws InterruptedException
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("sanjaysinghjsg@gmail.com","valid");
		hm.put("","invalid");
		hm.put("sanja56ewryj55@gmail.com","invalid");
		
		// for Each loop starting
		for(Map.Entry m:hm.entrySet())
		{
			// Run browser driver to open browser
			System.setProperty("webdriver.chrome.driver", "D://eclipse//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.name("identifier")).sendKeys((String)m.getKey(),Keys.ENTER);
			Thread.sleep(7000);
			
			// Validation
			try
			{
				if(m.getValue().equals("valid")&&driver.findElement(By.name("Password")).isDisplayed())
				{
					Thread.sleep(4000);
					System.out.println("Test passed");
				}
				else if(m.getValue().equals("invalid")&&driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]|(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
				{
					System.out.println("Test passed");
				}
		
				else
				{
					System.out.println("Test failed");
				}
			}catch(Exception ex)
			{
				System.out.println("Test interupted");
			}
			driver.close();
			
		}

	}

}
