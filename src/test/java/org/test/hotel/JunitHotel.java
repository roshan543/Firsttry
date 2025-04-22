package org.test.hotel;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class JunitHotel extends BaseClass {
	@BeforeClass
	public static void BeforeClass() {
		BrowserLaunch("chrome");
		url("https://adactinhotelapp.com/");
		wait(3);
	}
	@AfterClass
	public static void AfterClass() {
		quit(driver);
	}
	@After
	public  void After() {
	wait(15);
	}
	@Before
	public void Before() {
		Date d = new Date();
		System.out.println(d);
	}
	@Ignore
	@Test
	public void test() throws InterruptedException {
		PomHotel p= new PomHotel();
		btnclick(p.getnewuser());
		sendkeys(p.getusername(),"renirose14");
		Thread.sleep(2000);
		sendkeys(p.getpassword(),"1565265");
		Thread.sleep(2000);
		sendkeys(p.getcpassword(),"1565265");
		Thread.sleep(2000);
		sendkeys(p.getfullname(),"Praveen Roshan.P");
		Thread.sleep(2000);
		sendkeys(p.getemail(),"renirose14@gmail.com");
		Thread.sleep(9000);
		btnclick(p.getcheckbox());
		Thread.sleep(9000);
		btnclick(p.getsubmit());
	}
	
		@Test
		public void login() throws InterruptedException {
			PomHotel p = new PomHotel();
			sendkeys(p.getloginid(),"renirose14");
			sendkeys(p.getloginpassword(),"1565265");
			btnclick(p.getloginbtn());
			Assert.assertTrue(driver.getCurrentUrl().contains("SearchHotel"));
			select(p.getlocation(), "New York");
			select(p.gethotel(),"Hotel Cornice");
			select(p.getroom(),"Super Deluxe");
			select("1",p.getroomno());
			Date(p.getdate(),"28/04/2025");
			Date(p.getoutdate(),"30/04/2025");
			select(p.getadultroom(), "2 - Two");
			select(p.getchildroom(), "0 - None");
			btnclick(p.getsubmitt());
			Assert.assertTrue(p.getselecthotel().getText().contains("Select Hotel"));
			genderradiobutton(p.getselecthotelradio());
			btnclick(p.getcontinue());
			wait(5);
			Assert.assertTrue(driver.getCurrentUrl().contains("BookHotel"));		
			sendkeys(p.getfirstname(), "Praveen");
			sendkeys(p.getlastname(),"Roshan");
			sendkeys(p.getaddress(),"109/47,Adam Street,Royapuram,chennai 600013");
			sendkeys(p.getccard(), "6081239758025584");
			select("OTHR",p.getcctype());
			select("8",p.getcemonth());
			select(p.getceyear(),"2026");
			sendkeys(p.getcvv(),"284");
			btnclick(p.getbooknow());
			Thread.sleep(5000);
			Assert.assertTrue(driver.getCurrentUrl().contains("BookingConfirm"));
			String orderid = p.getorderno().getAttribute("value");
			System.out.println(orderid);	
		}
		}	


