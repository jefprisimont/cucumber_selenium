package com.jefri.stepDeff;

import com.jefri.BaseTest;
import io.cucumber.java.en.Then;

public class HomepageStepDeff extends BaseTest {

    HomepageStepDeff homePage;

    @Then("^user is on the Homepage$")
    public void userIsOnTheHomepage() {
        homePage =new HomepageStepDeff(driver);
        homePage.validateOnHomePage();
    }

}
