package com.ilCarro.stepDefenitions;

import static com.ilCarro.pages.BasePage.driver;

import com.ilCarro.pages.AddCarPage;
import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddCarSteps {

  @And("User Click ok in Logged in window")
  public void click_on_in_logged_window(){
    new LoginPage(driver).clickOkInLoggetIn();
  }

  @And("Click Let the car work link")
  public void Click_Let_the_car_work_link(){
    new HomePage(driver).clickOnLetCarWorkLink();
  }

  @And("User fill out form to add car")
  public void fill_out_form_to_add_car(){
    new AddCarPage(driver).selectLocation("Tel Aviv, Israel")
        .enterMainData("Ford", "Focus", "2015", "5", "b",
            "CC9985BB", "30", "The optimal car for you!")
        .selectFuel("Petrol")
        .uploadCarPhoto("D:/IMAGES/car.jpg");
  }

  @And("Click on submit button")
  public void click_on_submit_button(){
    new AddCarPage(driver).cllickOnSubmitButton();
  }

  @Then("User verify the car is added")
  public void verify_car_added(){
    new AddCarPage(driver).verifyCarAdded();
  }

}
