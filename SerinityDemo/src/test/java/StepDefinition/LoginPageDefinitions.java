package StepDefinition;

import Locators.LoginLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import support.StepDashboardPage;
import support.StepLoginInvalidCredentialsPage;
import support.StepLoginPage;
import support.StepLoginRequiredPage;


public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashboardPage dashPage;

    @Steps
    StepLoginInvalidCredentialsPage stepLoginInvalidCredentialsPage;

    @Steps
    StepLoginRequiredPage stepLoginRequiredPage;

    LoginLocators loginLocators=new LoginLocators();

    //---------------------------------Scenario 1 started here-------------------------------------
    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
        loginLocators.getatime();
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        loginLocators.getatime();
        dashPage.loginVerify();
    }

    //------------------------------------Scenario 1 Ended here--------------------------------------------

    //--------------------------------------Scenario 2 started here-------------------------------------------
    @Given("User will be on Homepage")
    public void User_will_be_on_Homepage(){
        loginPage.open();
        loginLocators.getatime();
    }
    @When("User enters Username as {string}")
    public void User_enters_Username(String usernameinv){
        stepLoginInvalidCredentialsPage.invalidinputUserName(usernameinv);
    }
    @And("User enters Password as {string}")
    public void User_enters_Password(String passinv){
        stepLoginInvalidCredentialsPage.invalidinputPassword(passinv);
        stepLoginInvalidCredentialsPage.invalidclickLogin();
    }
    @Then("User will get an error message from this {string} and {string}")
    public void User_will_get_as_error(String uinvalid, String pinvalid){
        loginLocators.getatime();
        stepLoginInvalidCredentialsPage.invaliderror(uinvalid,pinvalid);
    }
    //--------------------------------------Scenario 2 Ended here-------------------------------------------

    //--------------------------------------Scenario 3 started here-------------------------------------------

    @Given("User will get on this Homepage")
    public void User_will_get_on_Homepage(){
        loginPage.open();
        loginLocators.getatime();
    }
    @When("User will enters name as {string}")
    public void user_will_enter_username(String blankuser){
        stepLoginRequiredPage.blankUserName(blankuser);
    }
    @And("User will enters Pass as {string}")
    public void user_will_passowrd(String blankpass){
        stepLoginRequiredPage.blankPassword(blankpass);
        stepLoginRequiredPage.blankclickLogin();
    }
    @Then("User will get errors {string} and {string}")
    public void User_will_get_errors(String buser,String bpass){
        loginLocators.getatime();
        stepLoginRequiredPage.blankrequirederror(buser,bpass);
    }
}
