package support;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDashboardPage extends PageObject {

    @Step("Successful login")
    public void loginVerify() {
        String dashboardTitle = $(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        assertEquals(dashboardTitle, "Dashboard");
    }
}
