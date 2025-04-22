package org.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Sample extends BaseClass{
	public Sample() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	
	public WebElement getfirstname() {
		return firstname;
	}
	public WebElement getlastname(){
	return lastname;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	public WebElement password() {
	return password;
	}
	 @FindBy(xpath="(//input[@type='text'])[5]")
    private WebElement number;
	public WebElement mobilenumber(){
	return number;
	}
	@FindBy(xpath="//button[@type='submit']")
    private WebElement pombuttonclick;
	public WebElement pombuttonclick(){
		return pombuttonclick;
	}
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement genderradio;
	public WebElement genderradio(){
		return genderradio;
	}
	@FindBy(id="day")
	private WebElement day;
		public WebElement day() {
			return day;
	}
		@FindBy(id="month")
		private WebElement month;
		public WebElement month(){
			return month;
		}
		@FindBy(id="year")
		private WebElement year;
		public WebElement year(){
		return year;
		}	
}

