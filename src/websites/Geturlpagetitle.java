package websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturlpagetitle {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver get=new ChromeDriver();
		get.get("https://www.facebook.com");
		get.manage().window().maximize();
		String x=get.getTitle();
		System.out.println(x);
		String y=get.getPageSource();
		System.out.println(y);
		String z=get.getCurrentUrl();
		System.out.println(z);
		get.quit();
	}

}
