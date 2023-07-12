package com.ilCarro.pages;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage{

  public AddCarPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "pickUpPlace")
  WebElement pickUpPlace;

  public AddCarPage selectLocation(String city) {

    pickUpPlace.sendKeys(city);
    pause(1000);
    pickUpPlace.sendKeys(Keys.DOWN);
    pickUpPlace.sendKeys(Keys.ENTER);
//    click((WebElement) By.cssSelector("[div*='Tel Aviv']"));

    return this;
  }

  @FindBy(id = "make")
  WebElement makeByInput;
  @FindBy(id = "model")
  WebElement modelInput;
  @FindBy(id = "year")
  WebElement yearInput;
  @FindBy(id = "seats")
  WebElement seatsInput;
  @FindBy(id = "class")
  WebElement carClassInput;
  @FindBy(id = "serialNumber")
  WebElement serialNumberInput;
  @FindBy(id = "price")
  WebElement priceInput;
  @FindBy(id = "about")
  WebElement aboutInput;
  public AddCarPage enterMainData(String makeBy, String model, String year, String seats,
        String carClass, String serialNumber, String price, String about) {
    type(makeByInput, makeBy);
    type(modelInput, model);
    type(yearInput, year);
    type(seatsInput, seats);
    type(carClassInput, carClass);
    type(serialNumberInput, serialNumber);
    type(priceInput, price);
    type(aboutInput, about);
    return this;
  }

  @FindBy(id = "fuel")
  WebElement fuelSelect;
  @FindBy(css = "[value='Diesel']")
  WebElement diesel;
  @FindBy(css = "[value='Petrol']")
  WebElement petrol;
  @FindBy(css = "[value='Hybrid']")
  WebElement hybrid;
  @FindBy(css = "[value='Electric']")
  WebElement electric;
  @FindBy(css = "[value='Gas']")
  WebElement gas;
  public AddCarPage selectFuel(String fuel) {
//  Diesel Petrol Hybrid Electric Gas
    click(fuelSelect);
    switch (fuel) {
      case "Diesel":
        click(diesel);
        break;
      case "Petrol":
        click(petrol);
        break;
      case "Hybrid":
        click(hybrid);
        break;
      case "Electric":
        click(electric);
        break;
      case "Gas":
        click(gas);
        break;
    }
    fuelSelect.sendKeys(Keys.ENTER);
    return this;
  }

  @FindBy(id = "photos")
  WebElement photosUpload;
  public AddCarPage uploadCarPhoto(String photoPath) {
    photosUpload.sendKeys(photoPath);
    return this;
  }

  @FindBy(xpath = "//button[.='Submit']")
  WebElement submitButton;
  public AddCarPage cllickOnSubmitButton() {
  click(submitButton);
    return this;
  }

  @FindBy(xpath = "//h2[contains(., 'added successful')]")
  WebElement addedSuccessful;
  public AddCarPage verifyCarAdded() {
    assert isElementDisplayed(addedSuccessful);
    return this;
  }
}
