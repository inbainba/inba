package org.pojo;
import org.sam.BaseClass;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class FbLogin extends BaseClass {

		public FbLogin() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//input[@id='email']")
		private WebElement email;

		@FindBy(xpath = ("//input[@aria-label='Password']"))
		private WebElement pwd;

		@FindBy(name = "login")
		private WebElement logBtn;
	

		public WebElement getemail(){
			return email;
		}

		public WebElement getPwd() {
			return pwd;
		}

		public WebElement getLogBtn() {
			return logBtn;
		}

	}
