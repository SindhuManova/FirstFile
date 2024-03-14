package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.browser.Browser.GetWindowForTargetResponse;
import io.netty.handler.codec.socks.SocksSubnegotiationVersion;

public class GmailProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\"
				+ "eclipse-workspace\\GmailProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
				
		//WebDriver Commands
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		Point p = new Point(250,500);
		driver.manage().window().setPosition(p);


	    WebElement log = driver.findElement(By.name("login"));
	    String attribute = log.getAttribute("type");
	    System.out.println(attribute);
	}
}
