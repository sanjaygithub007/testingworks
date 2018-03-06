package websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("sanjay");
		driver.findElement(By.name("lastname")).sendKeys("singh");
		driver.findElement(By.name("reg_email__")).sendKeys("sanjaysinghjsg@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		WebElement e=driver.findElement(By.name("birthday_day"));
		Select s=new Select();
		System.out.println("s.getOptions().size()");
		

		
		
		
	}

	private void selectByVisibleText(String string) {
		// TODO Auto-generated method stub
		
	}

}
