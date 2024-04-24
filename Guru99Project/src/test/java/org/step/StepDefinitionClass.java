package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	
	WebDriver driver;
	
	@Given("User navigate the Guru{int} URL")
	public void user_navigate_the_Guru_URL(Integer int1) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demo.guru99.com/V4/");	
		Thread.sleep(2000);
	}

	@When("User enter invalide user name and invalide password")
	public void user_enter_invalide_user_name_and_invalide_password() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr531855");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("agEdUbE");
	    
	}

	@And("User enter login Button")
	public void user_enter_login_Button() {
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
	    
	}

	@Then("User validate error message After login")
	public void user_validate_error_message_After_login() {
		System.out.println("User or Password is not valid");
	
	}
}
