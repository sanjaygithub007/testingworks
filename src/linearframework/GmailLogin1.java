package linearframework;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailLogin1 {

	
	public static void main(String[] args) {
		// Get Data From KeyBoard
				Scanner s=new Scanner(System.in);
				System.out.println("Enter your Email.id");
				String eid=s.nextLine();
				System.out.println("Enter Email criteria is valid or invalid");
				String crit=s.nextLine();
				// Create html file for results
				ExtentReports er=new ExtentReports("gmailresults.html",false);
				ExtentTest et=er.startTest("Gmail userId Testing");
				// Launch site
				System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				JavascriptExecutor js=(JavascriptExecutor) driver;
				driver.get("https://www.gmail.com");
				Thread.sleep(4000);
				driver.manage().window().maximize();
				
				//Operation
				//Enter Email id and click next
				driver.findElement(By.name("identifier")).sendKeys(eid);
				driver.findElement(By.id("identifierNext")).click();
				Thread.sleep(4000);

				//Observation  //Validation
				try
				{
					if(crit.equalsIgnoreCase("valid")&&driver.findElement(By.name("password")).isDisplayed())
					{
						et.log(LogStatus.PASS,"Test Passed");
						WebElement e=driver.findElement(By.name("password"));
						js.executeScript("arguments[0].style.border='2px dotted blue';",e);
						File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dest=new File("Pic1.png");
						FileUtils.copyFile(src,dest);
						et.log(LogStatus.PASS,et.addScreenCapture("Pic1.png"));
						
					}
				
						
				//Close
				}
	
				
	}

}