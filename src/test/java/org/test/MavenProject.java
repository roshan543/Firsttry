package org.test;

import org.openqa.selenium.By;

public class MavenProject extends BaseClass{
	public static void main(String[] args) {
	BrowserLaunch("chrome");
      url("https://www.facebook.com/");		
btnclick(driver.findElement(By.xpath("(//a[@role='button'])[2]")));
      wait(3);
      Sample p= new Sample();
      sendkeys(p.getfirstname(),"Praveen123");
      sendkeys(p.getlastname(),"Roshan");
      select(p.day(),"26");
      select(p.month(),"Feb");
      select(p.year(),"2010");
      radiobutton(p.genderradio());
      sendkeys(p.mobilenumber(),"9852236971");
     sendkeys(p.password(),"12345");
      btnclick(p.pombuttonclick());
   // wait(10);
		//quit(Driver);
	//	close(Driver);	

      
}
}
