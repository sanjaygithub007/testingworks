package datadrivenframework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Open existing file for test data reading
			File f=new File("Gmaildata.xls");
			Workbook rwb=Workbook.getWorkbook(f);
			Sheet rsh=rwb.getSheet(0);
			int nour=rsh.getRows();
			int nouc=rsh.getColumns();
			
		//Open same excel file results writing
			WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
			WritableSheet wsh=wwb.getSheet(0);
			
		//Data driven testing
		//0th row have columns heading
			for(int i=1;i<nour;i++)
			{
				String u=rsh.getCell(0,i).getContents();
				String uc=rsh.getCell(1,i).getContents();
				String p=null;
				String pc=null;
				if(uc.equalsIgnoreCase("valid"))
				{
					p=rsh.getCell(2,i).getContents();
					pc=rsh.getCell(3,i).getContents();
				}
			//launch Site
			
				System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.gmail.com");
				Thread.sleep(5000);
				// Fill user id and click next
				driver.findElement(By.name("identifier")).sendKeys(u);
				driver.findElement(By.id("identifierNext")).click();
				Thread.sleep(5000);
				//user id validation
				try
					{
						if((u.length()==0)&&(driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]")).isDisplayed()))
						{
							Label l=new Label(nouc,i,"Test Passed for Blank uid");
							wsh.addCell(l);
						}
						else if(uc.equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
						{
							Label l=new Label(nouc,i,"Test Passed for Invalid uid");
							wsh.addCell(l);
						}
						else if(uc.equalsIgnoreCase("valid")&&driver.findElement(By.name("password")).isDisplayed())
						{
						//Enter Password click next
						driver.findElement(By.name("password")).sendKeys(p);
						driver.findElement(By.id("passwordNext")).click();
						Thread.sleep(8000);
						//Password validation
						if(p.length()==0&&driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
						{
							Label l=new Label(nouc,i,"Test Passed for Blank pwd");
							wsh.addCell(l);
						}
						else if(pc.equalsIgnoreCase("invalid")&&driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
						{
							Label l=new Label(nouc,i,"Test Passed for Invalid pwd");
							wsh.addCell(l);
						}
						else if(uc.equalsIgnoreCase("valid")&&driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
						{
							Label l=new Label(nouc,i,"Test Passed for valid pwd");
							wsh.addCell(l);
						}
						else
						{
							Label l=new Label(nouc,i,"Test failed for password");
							wsh.addCell(l);
						}
					}
						else
						{
							Label l=new Label(nouc,i,"Test failed for user id");
							wsh.addCell(l);
						}
					}
					
					catch(Exception ex)
					{
						Label l=new Label(nouc,i,"Test Interupted");
						wsh.addCell(l);
					}
					driver.close();
				}
				wwb.write();
				wwb.close();
				rwb.close();
				}
			}


			



		
	