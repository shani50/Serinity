package support;

import Locators.LoginLocators;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepLoginInvalidCredentialsPage extends PageObject {
    LoginLocators loginLocators = new LoginLocators();

    @Step("Enter the Username")
    public void invalidinputUserName(String userName) {
        $(By.xpath("//input[@placeholder='Username']")).sendKeys((userName));
    }

    @Step("Enter the Password")
    public void invalidinputPassword(String passWord) {
        $(By.xpath("//input[@placeholder='Password']")).sendKeys((passWord));
    }

    @Step("Click the Submit Button")
    public void invalidclickLogin() {
        $(By.xpath("//button[@type='submit']")).click();
    }

    @Step("Get the Error")
    public void invaliderror(String userName,String passWord){
        if(userName=="Admin" && passWord!="admin123") {
            String user = $(By.xpath(loginLocators.lInvalid_Credential_Error)).getText();
            Assert.assertEquals("Invalid credentials",user);
        } else if (userName!="Admin" && passWord=="admin123") {
            String pass = $(By.xpath(loginLocators.lInvalid_Credential_Error)).getText();
            Assert.assertEquals("Invalid credentials",pass);
        }else if(userName!="Admin"&&passWord!="admin123"){
            String comm = $(By.xpath(loginLocators.lInvalid_Credential_Error)).getText();
            Assert.assertEquals("Invalid credentials",comm);
        }
    }
}
