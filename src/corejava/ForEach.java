package corejava;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {

	public static void main(String[] args) 
	{
		// For Each loop 
		// Count all the link text presents in Gmail site
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getText();
			count=count+1;
			System.out.println(x);
		}

		System.out.println("count of all tags="+count);
		for(WebElement e:l)
		{
			String x=e.getText();
			System.out.println(x);
		}
		driver.close();
	}

}
