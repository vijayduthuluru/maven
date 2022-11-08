package com.step_definition2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Definition1 {
	
  public static WebDriver driver;
	
	
  
	
	@Given("^user must launch the url$")
	public void user_must_launch_the_url() throws Throwable {
		
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@When("^user Enter The Username In The Username field$")
	public void user_Enter_The_Username_In_The_Username_field() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("^User Enter The Password In The Username Field$")
	public void user_Enter_The_Password_In_The_Username_Field() throws Throwable {	
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
//	@Then("^User Click The Login Button And It Navigate To The Search Hotel Page$")
//	public void user_Click_The_Login_button_and_It_Navigate_To_The_Search_Hotel_page() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}


	@Then("user click the login button and it navigate to the next page")
	public void user_click_the_login_button_and_it_navigate_to_the_next_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



	

}
