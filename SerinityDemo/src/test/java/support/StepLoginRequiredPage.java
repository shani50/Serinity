package support;

import Locators.LoginLocators;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepLoginRequiredPage extends PageObject {
    LoginLocators loginLocators = new LoginLocators();

    @Step("Enter the Username")
    public void blankUserName(String userName) {
        $(By.xpath("//input[@placeholder='Username']")).sendKeys((userName));
    }

    @Step("Enter the Password")
    public void blankPassword(String passWord) {
        $(By.xpath("//input[@placeholder='Password']")).sendKeys((passWord));
    }

    @Step("Click the Submit Button")
    public void blankclickLogin() {
        $(By.xpath("//button[@type='submit']")).click();
    }

    @Step("Get the Error")
    public void blankrequirederror(String userName,String passWord){
        if(userName!="" && passWord=="") {
            String user = $(By.xpath(loginLocators.lpass_blank)).getText();
            Assert.assertEquals("Required",user);
        } else if (userName=="" && passWord!="") {
            String pass = $(By.xpath(loginLocators.luser_blank)).getText();
            Assert.assertEquals("Required",pass);
        }else if(userName==""&&passWord==""){
            String userBlank = $(By.xpath(loginLocators.luserblank_passblank)).getText();
            String passBlank = $(By.xpath(loginLocators.lpassblank_userblank)).getText();
            Assert.assertEquals("Required",userBlank);
            Assert.assertEquals("Required",passBlank);
        }
    }
}
