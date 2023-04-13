package support;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

    @Step("Enter Username")
    public void inputUserName(String userName) {
        $(By.xpath("//input[@placeholder='Username']")).sendKeys((userName));
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        $(By.xpath("//input[@placeholder='Password']")).sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        $(By.xpath("//button[@type='submit']")).click();
    }

}