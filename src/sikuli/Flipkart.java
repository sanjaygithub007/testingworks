package sikuli;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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

public class Flipkart 
{
	public static void main(String[] args) throws FindFailed, InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Screen s=new Screen();
		s.click("cross.png");
		s.mouseMove("men.png");
		Location l=new Location(200,300);
		s.wheel(l,Button.LEFT,0);
		Match m=s.find("scrol.png");
		int x=m.getX();
		int y=m.getY();
		Location l1= new Location(x,y+900);
		s.dragDrop(m, l1);
		Thread.sleep(5000);
		s.wheel(Button.WHEEL_UP,5);
		Thread.sleep(5000);
		
		//get full screen image
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("D://eclipse//testing//flipfullimg.png");
		ImageIO.write(bi,"png",f1);
		
		//get part of screen image
		Region r=new Region(200,300,200,300);
		ScreenImage si1=s.capture(r);
		BufferedImage bi1=si1.getImage();
		File f2=new File("D://eclipse//testing//region1img.png");
		ImageIO.write(bi1, "png", f2);
		
		//
		s.keyDown(Key.ALT);
		s.keyDown(Key.F4);
		s.keyUp(Key.ALT);
		s.keyUp(Key.F4);
	}

}
