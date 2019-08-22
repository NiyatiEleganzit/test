package com.cucumber.CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver = new FirefoxDriver();

	/*
	 * @Before public void setup() { driver = new FirefoxDriver(); }
	 */

	@Given("^open teamnest$")
	public void I_visit_google() {
		driver.get("https://eleganzit.teamnest.com/login/");
	}

	@When("^login into teamnest$")
	public void i_search_for() throws InterruptedException {
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("niyati.eleganzit@gmail.com");
		driver.findElement(By.id("user-password")).clear();
		driver.findElement(By.id("user-password")).sendKeys("aditya@123");
		driver.findElement(By.id("btn")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"punchin-success\"]")));
		
	}

	@Then("^the page title should start with \"([^\"]*)\"$")
	public void the_page_title_should_start_with(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}

}
