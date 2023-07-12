package com.ilCarro.stepDefenitions;

import static com.ilCarro.pages.BasePage.driver;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

public class LoginSteps {

  @And("User click on Log in link")
  public void click_on_Log_in_link(){
    new HomePage(driver).clickOnLoginLink();
  }

  @And("Users enters valid data")
  public void enters_valid_data(){
    new LoginPage(driver).enterData("lisawan@gmail.com", "$Lisawan87$");
  }

  @And("User click on Yalla button")
  public void click_on_Yalla_button(){
    new LoginPage(driver).clickOnYallaButton();
  }

  //LOGIN: lisawan@gmail.com | PASSWORD: $Lisawan87$
  @Then("User verifies Log in message")
  public void verifies_Login_message(){
    new LoginPage(driver).isLoginMessageDisplayed();
  }

  @And("Users enters valid email and wrong password")
  public void enter_valid_email_and_wrong_password(DataTable table){
    new LoginPage(driver).enterWrongData(table);
  }

  @Then("User verifies error")
  public void verifies_error(){
    new LoginPage(driver).getError();
  }

}





