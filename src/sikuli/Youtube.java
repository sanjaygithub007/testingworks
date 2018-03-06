package sikuli;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Youtube {

	
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("kalam sir speach");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'A P J Abdul Kalam in European')]")).click();
		Thread.sleep(5000);
		Screen s=new Screen();
		if(s.exists("Skip.png")!=null)
		{
			s.click("Skip.png");
		}
		Thread.sleep(5000);
		Location l=new Location(300,300);
		s.wheel(l,Button.LEFT,0);
		s.click("pause.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0);
		s.click("play.png");
		Thread.sleep(3000);
		s.wheel(l,Button.LEFT,0);
		s.mouseMove("volume.png");
		s.drag("volpnt");
		s.dropAt(100);
		Thread.sleep(3000);
		s.click("maximize.png");
		Match e=s.find("volpnt.png");
		int x=e.getX();
		int y=e.getY();
		Location sl1=new Location(x-30,y);
		s.dragDrop(e, sl1);
		Thread.sleep(3000);
		Location sl2=new Location(x+60,y);
		s.dragDrop(e,sl2);
		
		//capture full screen(sikuli)
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("D://eclipse//testing//Fullscreen.png");
		ImageIO.write(bi, "png", f1);
		Region r=new Region(200,100,200,300);
		ScreenImage si1=s.capture(r);
		BufferedImage bi1=si1.getImage();
		File f2=new File("D://eclipse//testing//region.png");
		ImageIO.write(bi1, "png",f2);
		s.keyDown(Key.ALT);
		s.keyDown(Key.F4);
		s.keyUp(Key.ALT);
		s.keyUp(Key.F14);
	}

}
