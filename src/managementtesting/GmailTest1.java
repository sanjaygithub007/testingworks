package managementtesting;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
	
				Scanner s=new Scanner(System.in);
				System.out.println("Enter your valid Email Id");
				String se=s.nextLine();
				System.out.println("Enter Criteria");
				String sc=s.nextLine();
				
				//Email Site Launching
				
				System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.gmail.com");
				driver.manage().window().maximize();
				Thread.sleep(4000);
				
				//Enter User Id and Password
				
				driver.findElement(By.name("identifier")).sendKeys(se);
				driver.findElement(By.id("identifierNext")).click();
				
				//Validation
				
				if(sc.equalsIgnoreCase("valid")&&driver.findElement(By.name("password")).isDisplayed())
				{
					System.out.println("Test Passed");
				}
				else if(sc.equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]|(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
					{
					System.out.println("Test passed");
					}
				else
				{
					System.out.println("Test Failed");
				}
				
				//close Site
				driver.close();
	}

}
