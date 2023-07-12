package com.ilCarro.stepDefenitions;

import static com.ilCarro.pages.BasePage.driver;

import com.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

  @Given("User launches browser")
  public void launch_Browser(){
    new HomePage(driver).launchBrowser();
  }

  @When("User opens ilCarro Home Page")
  public void open_Il_Carro_Home_Page(){
    new HomePage(driver).openURL();
  }

  @Then("User verifies Home Page title")
  public void verify_Home_Page_Title(){
    new HomePage(driver).isHomePageTitlePresent();
  }

  @And("User quit browser")
  public void User_quit_browser(){
    new HomePage(driver).quit();
  }


}
