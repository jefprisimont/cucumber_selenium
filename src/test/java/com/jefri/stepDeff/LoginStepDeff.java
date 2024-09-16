package com.jefri.stepDeff;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.jefri.page.LoginPage;
import com.jefri.BaseTest;

public class LoginStepDeff {

    LoginPage loginPage;

    @Given("^user is on the login page$")
    public void userIsOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("^user input username with \"([^\"]*)\"$")
    public void userInputUsernameWith(String username) throws Throwable {
        loginPage.inputUsername(username);
        throw new cucumber.api.PendingException();
    }

    @And("^user input password with \"([^\"]*)\"$")
    public void userInputPasswordWith(String password) throws Throwable {
        loginPage.inputPassword(password);
        throw new cucumber.api.PendingException();
    }

    @When("^user click the login button$")
    public void userClickTheLoginButton() {
        loginPage.clickLoginButton();
    }


}
