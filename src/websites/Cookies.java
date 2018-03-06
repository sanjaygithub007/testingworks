package websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies are loaded to the site");
		}
		else
		{
			System.out.println("cookies were not loaded to the sites");
		}
	driver.close();
	}

}
