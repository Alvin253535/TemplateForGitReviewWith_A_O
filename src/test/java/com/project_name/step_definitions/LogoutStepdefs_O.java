package com.project_name.step_definitions;

import com.project_name.pages.LoginPage_A;
import com.project_name.pages.LogoutPage_O;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.*;

public class LogoutStepdefs_O {

LoginPage_A loginPage_o =new LoginPage_A();
LogoutPage_O logoutPage_a =new LogoutPage_O();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user logged in with valid credential")
    public void user_logged_in_with_valid_credential() {
     loginPage_o.login();
    }
    @When("user clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
    logoutPage_a.logout();

    }

}
