package com.Runnerclass;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\Cucumber.feature", glue = "com\\step_definition2",
  plugin= {"html:Report/report.html"})

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\maven\\Driver\\chromedrivernew.exe");
		
	}

	@AfterClass
	public static void teardown() {
		 driver.close();

	}

}
