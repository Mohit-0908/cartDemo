package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class SignUpPage {
	public WebDriver driver;
	
	//CONSTRUCTOR
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//strong[contains(text(),'Sign Up')]")
	WebElement btnSignUp ;
	
	@FindBy(xpath="//input[@id='register_username']")
	WebElement txtName ;
	
	@FindBy(xpath="//input[@id='register_email']")
	WebElement txtMail;
	
	@FindBy(xpath="//input[@id='register_plainPassword_first']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='register_plainPassword_second']")
	WebElement txtPassword2;

	@FindBy(xpath="//label[normalize-space()='Please contact me via e-mail']")
	WebElement btnAgree ;
	
	@FindBy(xpath="//label[normalize-space()='I have read and accept the Terms and Conditions']")
	WebElement btnAgree1;
	
	@FindBy(xpath="//span[@class='button__content']")
	WebElement btnSubmit;
	
	//Acton Methods
	public void addSign() {
		btnSignUp.click();
		txtName.sendKeys("mohit");
		txtMail.sendKeys("mg@gmail.com");
		txtPassword.sendKeys("123");
		txtPassword2.sendKeys("123");
		btnAgree.click();
		btnAgree1.click();
		//btnSubmit.click();
		
		
	}

	
	
}
