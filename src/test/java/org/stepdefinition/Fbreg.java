//package org.stepdefinition;
//
//
//
//import java.util.List;
//import java.util.Map;
//
//import org.pojo.SigPo;
//import org.sam.BaseClass;
//
//import io.cucumber.datatable.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Fbreg extends BaseClass{
//	
//	SigPo s;
//	@Given("To launch the browser and maximise the window")
//	public void to_launch_the_browser_and_maximise_the_window() {
//		LaunchBrowser();
//		windowMaximize();
//	}
//
//	@When("To launch url of fb application")
//	public void to_launch_url_of_fb_application() {
//		launchUrl("https://www.facebook.com/");
//	    
//	}
//
//	@When("To click the create new account button")
//	public void to_click_the_create_new_account_button() {
//		s = new SigPo();
//	   clickBtn(s.getCreateNewAcc());
//	}
//
//	@When("To pass firstname in firstname text box")
//	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
//		Thread.sleep(3000);
//		Map<String, String> m = d.asMap(String.class, String.class);
//		s = new SigPo();
//		passText(m.get("firstname3"), s.getFirstName());
//	    
//	}
//
//	@When("To pass secondname in secondname text box")
//	public void to_pass_secondname_in_secondname_text_box() {
//		s = new SigPo();
//		   passText("inbaraj", s.getSecondName());
//	   
//	}
//
//	@When("To pass mobileno or email in email text box")
//	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
//		List<Map<String, String>> m = d.asMaps();
//		s = new SigPo();
//		   passText(m.get(1).get("password"), s.getMobileoremail());
//	}
//
//	@When("To create new password using new password text box")
//	public void to_create_new_password_using_new_password_text_box() {
//		s = new SigPo();
//		   passText("inba", s.getNewpassword());
//	    
//	}
//
//	@Then("To close the chrome browser")
//	public void to_close_the_chrome_browser() {
//		//closeEntireBrowser();
//	    
//	}
//
//
//
//}
