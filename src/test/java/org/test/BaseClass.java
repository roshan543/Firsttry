package org.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
/*		
	
//	public static WebDriver browserLaunch (String Launch) {
	//if(Launch.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
//	}
//	else if(Launch.equalsIgnoreCase("edge")) {
//		driver=  new EdgeDriver();
//	
//	}
//	else if(Launch.equalsIgnoreCase("firefox")) {
//		driver=  new FirefoxDriver();
//	}
//	return driver;
//	}
	*/
	
	public static WebDriver driver;
		public static WebDriver BrowserLaunch(String name){
			switch(name) {
				case "chrome": 
					driver = new ChromeDriver();
					break;
				case "edge":
					driver = new EdgeDriver();
					break;
				case "firefox":
					driver = new FirefoxDriver();
					break;
				default:
					driver = new InternetExplorerDriver();
					break;
			}
			return driver;
				}
		public static void url(String s)
		{
		driver.get(s);
		driver.manage().window().maximize();
	
		
		driver.get(s);
		driver.manage().window().minimize();
		
		}
		public static void sendkeys(WebElement e,String s) {
			e.sendKeys(s);
			
		}
		public static void btnclick(WebElement e) {
			e.click();
		}
		public static void quit(WebDriver e) {
			e.quit();
			}
		public static void close(WebDriver e) {

			e.close();
		}
		public static void wait(int i) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
		}
		public static void radiobutton(WebElement e) {
				e.click();	
		}
		public static void select(WebElement e,String d) {
			Select s = new Select(e);
			s.selectByVisibleText(d);
		}
	
	

}
