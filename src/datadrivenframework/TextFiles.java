package datadrivenframework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFiles 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Open existing file for test data reading
		File f1=new File("gmailtestdata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		// Create new text File for results
		File f2=new File("gmailresults.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		// Data Driven Testing
		String l;
		while((l=br.readLine())!=null)
		{
			// Split Line text in to pieces
			String p[]=l.split(",");
			//launch site
			System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			// Fill user id and click next
			driver.findElement(By.name("identifier")).sendKeys(p[0]);
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(5000);
			//user id validation
			try
			{
				if(p[0].length()==0&&driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]")).isDisplayed())
				{
					bw.write("Test Passed for Blank uid");
					bw.newLine();
				}
				else if(p[1].equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("(//*[contains(text(),'Find your Google Account')])[2]")).isDisplayed())
				{
					bw.write("Test Passed for Invalid uid");
					bw.newLine();
				}
				else if(p[1].equalsIgnoreCase("valid")&&driver.findElement(By.name("password")).isDisplayed())
				{
					bw.write("Test Passed for valid uid");
					bw.newLine();
				
				//Enter Password click next
				driver.findElement(By.name("password")).sendKeys(p[2]);
				driver.findElement(By.name("passwordNext")).click();
				Thread.sleep(5000);
				//Password validation
				if(p[2].length()==0&&driver.findElement(By.xpath("//*[text(),'Enter a password']")).isDisplayed())
				{
					bw.write("Test Passed for Blank password");
					bw.newLine();
				}
				else if(p[3].equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("//*[contains(text(),'wrong password')]")).isDisplayed())
				{
					bw.write("Test Passed for Invalid password");
					bw.newLine();
				}
				else if(p[3].equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("//*[text(),'COMPOSE']")).isDisplayed())
				{
					bw.write("Test Passed for Invalid password");
					bw.newLine();
				}
				else
				{
					bw.write("Test failed for password");
					bw.newLine();
				}
			}
			else
			{
				bw.write("Test failed for uid");
				bw.newLine();
			}
		}
			
			catch(Exception ex)
			{
				bw.write("Test Interupted");
				bw.newLine();
			}
			driver.close();
			}
		br.close();
		fr.close();
		bw.close();
		fw.close();
		}
	}

	



