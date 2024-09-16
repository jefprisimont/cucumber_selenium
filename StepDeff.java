package stepDeff;

public class LoginStepDeff {

    Webdriver driver;
    LoginPage.features


    @io.cucumber.java.en.Given("^user is on the login page$")
    public void userIsOnTheLoginPage() {
        WebDriverManager.chromedriver()
        driver.get("https://www.saucedemo.com/")
        loginPage =new LoginPage(driver)''
    }
    }

    @io.cucumber.java.en.And("^user input username with \"([^\"]*)\"$")
    public void userInputUsernameWith(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.And("^user input password with \"([^\"]*)\"$")
    public void userInputPasswordWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above int
    @io.cucumber.java.en.When("^user click the login button$")
    public void userClickTheLoginButton() {
    }

    @io.cucumber.java.en.Then("^user is on the Homepage$")
    public void userIsOnTheHomepage() {
    }
}
