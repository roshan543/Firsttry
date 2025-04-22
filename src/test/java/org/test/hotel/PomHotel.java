package org.test.hotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PomHotel extends BaseClass{
	public PomHotel() {
		PageFactory.initElements(driver, this);	
	}
@FindBy(xpath="//a[text()='New User Register Here']")
private WebElement newuser;
public WebElement getnewuser(){
	return newuser;
}
@FindBy(id="username")
private WebElement username;
public WebElement getusername() {
	return username;
}
@FindBy(id="password")
private WebElement password;
public WebElement getpassword() {
	return password;
}
@FindBy(id="re_password")
private WebElement cpassword;
public WebElement getcpassword() {
	return cpassword;
}

@FindBy(id="full_name")
private WebElement full_name;
public WebElement getfullname() {
	return full_name;
}

@FindBy(id="email_add")
private WebElement emailadd;
public WebElement getemail() {
	return emailadd;
}
@FindBy(id="tnc_box")
private WebElement cbox;
public WebElement getcheckbox() {
	return cbox;
}
@FindBy(id="Submit")
private WebElement submit;
public WebElement getsubmit() {
	return submit;
}
@FindBy(id="username")
private WebElement loginid;
public WebElement getloginid() {
	return loginid;
}
@FindBy(id="password")
private WebElement loginpassword;
public WebElement getloginpassword() {
	return loginpassword;
}

@FindBy(id="login")
private WebElement loginbtn;
public WebElement getloginbtn() {
	return loginbtn;
}

@FindBy(id="location")
private WebElement location;
public WebElement getlocation() {
	return location;
}
@FindBy(id="hotels")
private WebElement hotel;
public WebElement gethotel() {
	return hotel;
}

@FindBy(id="room_type")
private WebElement roomtype;
public WebElement getroom() {
	return roomtype;
}

@FindBy(id="room_nos")
private WebElement roomno;
public WebElement getroomno() {
	return roomno;
}
@FindBy(id="adult_room")
private WebElement adultroom;
public WebElement getadultroom() {
	return adultroom;
}
@FindBy(id="child_room")
private WebElement childroom;
public WebElement getchildroom() {
	return childroom;
}
@FindBy(id="Submit")
private WebElement Submit;
public WebElement getsubmitt() {
	return Submit;
}
@FindBy(id="datepick_in")
private WebElement fromdate;
public WebElement getdate() {
	return fromdate;
}
@FindBy(id="datepick_out")
private WebElement outdate;
public WebElement getoutdate() {
	return outdate;
}

@FindBy(xpath="//td[contains(text(),'Select Hotel ')]")
private WebElement selecthotel;
public WebElement getselecthotel() {
	return selecthotel;
}

@FindBy(xpath="//td[contains(text(),'Booking Confirmation ')]")
private WebElement Booking;
public WebElement getbookingconfirmation() {
	return Booking;
}


@FindBy(id="radiobutton_0")
private WebElement selecthotelradio;
public WebElement getselecthotelradio() {
	return selecthotelradio;
}

@FindBy(id="continue")
private WebElement continues;
public WebElement getcontinue() {
	return continues;
}
@FindBy(id="first_name")
private WebElement firstname;
public WebElement getfirstname() {
	return firstname;
}
@FindBy(id="last_name")
private WebElement lastname;
public WebElement getlastname() {
	return lastname;
}
@FindBy(id="address")
private WebElement address;
public WebElement getaddress() {
	return address;
}

@FindBy(id="cc_num")
private WebElement ccard;
public WebElement getccard() {
	return ccard;
}

@FindBy(id="cc_type")
private WebElement cctype;
public WebElement getcctype() {
	return cctype;
}
@FindBy(id="cc_exp_month")
private WebElement cemonth;
public WebElement getcemonth() {
	return cemonth;
}
@FindBy(id="cc_exp_year")
private WebElement ceyear;
public WebElement getceyear() {
	return ceyear;
}

@FindBy(id="cc_cvv")
private WebElement cvv;
public WebElement getcvv() {
	return cvv;
}
@FindBy(id="book_now")
private WebElement booknow;
public WebElement getbooknow() {
	return booknow;
}
@FindBy(id="order_no")
private WebElement orderno;
public WebElement getorderno() {
	return orderno;
}
}
