package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Nam libero tempore')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(5000);
		System.out.println(element.getText());
		/*try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		driver.close();
	}

}
