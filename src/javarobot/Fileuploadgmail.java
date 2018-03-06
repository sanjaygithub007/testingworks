package javarobot;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadgmail 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("pasaniarjun@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("madhubanme219",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		//driver.findElement(By.xpath("//*[@gh='cm']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("puspak123@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("task");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Do u finish the task");
		driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
		Thread.sleep(5000);
		Robot r=new Robot();
		 
		
		//driver.findElement(By.xpath("//*[@class='Ar Au']")).sendKeys("have u done the task");	
		
		
		driver.findElement(By.xpath(".//*[@id='aw0']/img")).click();
		
	}
	//*[@class='aoD az6']
}
