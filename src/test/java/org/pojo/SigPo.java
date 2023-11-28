package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class SigPo extends BaseClass{
	
	public SigPo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement secondName;
	
	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}
	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newpassword;

	
	

}
