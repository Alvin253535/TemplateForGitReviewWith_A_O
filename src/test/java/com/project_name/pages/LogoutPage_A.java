package com.project_name.pages;

import com.project_name.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_A extends BasePage{

 @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement logoutButton;


 public void logout(){
     BrowserUtils.sleep(2);
     logoutButton.click();
 }

}

/*
 @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement logoutButton;


 public void logout(){
     BrowserUtils.sleep(2);
     logoutButton.click();
 }
 */